package de.cantry.skinbidlistener;

import de.cantry.skinbidlistener.response.FullAuction;
import discord4j.common.util.Snowflake;
import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.message.ReactionAddEvent;
import discord4j.core.event.domain.message.ReactionRemoveEvent;
import discord4j.core.object.entity.Member;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.User;
import discord4j.core.object.entity.channel.Channel;
import discord4j.core.object.entity.channel.PrivateChannel;
import discord4j.core.object.reaction.ReactionEmoji;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.MessageEditRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static de.cantry.skinbidlistener.Utils.fullAuctionToEmbed;

public class SkinBidBot {

    private final Snowflake POST_CHANNEL = Snowflake.of("");
    private final Snowflake GUILD = Snowflake.of("");
    private final String BOT_TOKEN = "";
    private final Snowflake REACTION_ID = Snowflake.of("");
    private final String REACTION_NAME = "";
    private final boolean REACTION_ANIMATED = false;
    private HashMap<String, FullAuction> auctionHashToFullAuction = new HashMap<>();
    private HashMap<String, Snowflake> auctionHashToMessage = new HashMap<>();
    private HashMap<Snowflake, List<User>> auctionHashToListeners = new HashMap<>();
    private GatewayDiscordClient discordClient;

    public SkinBidBot() {
        discordClient = DiscordClient.create(BOT_TOKEN).login().block();

        discordClient.on(ReactionAddEvent.class).subscribe(reactionAddEvent -> {
            if (discordClient.getSelf().block().getId().equals(reactionAddEvent.getUserId())) {
                return;
            }
            auctionHashToMessage.entrySet().stream().filter(entry -> entry.getValue().equals(reactionAddEvent.getMessageId())).findFirst().ifPresent(entry -> {
                reactionAddEvent.getEmoji().asCustomEmoji().ifPresent(custom -> {
                    if (REACTION_ID.equals(custom.getId())) {
                        auctionHashToListeners.putIfAbsent(entry.getValue(), new ArrayList<>());
                        auctionHashToListeners.compute(entry.getValue(), ((snowflake, users) -> {
                            users.add(reactionAddEvent.getUser().block());
                            return users;
                        }));
                        System.out.println(auctionHashToListeners.get(reactionAddEvent.getMessageId()).size());
                    }
                });
            });
        });

        discordClient.on(ReactionRemoveEvent.class).subscribe(reactionRemoveEvent -> {
            if (discordClient.getSelf().block().getId().equals(reactionRemoveEvent.getUserId())) {
                return;
            }
            auctionHashToMessage.entrySet().stream().filter(entry -> entry.getValue().equals(reactionRemoveEvent.getMessageId())).findFirst().ifPresent(entry -> {
                reactionRemoveEvent.getEmoji().asCustomEmoji().ifPresent(custom -> {
                    if (REACTION_ID.equals(custom.getId())) {
                        if (auctionHashToListeners.containsKey(entry.getValue())) {
                            auctionHashToListeners.compute(entry.getValue(), ((snowflake, users) -> {
                                users.remove(reactionRemoveEvent.getUser().block());
                                return users;
                            }));
                        }
                    }
                });
            });
        });
    }


    public void start() {
        SkinBidClient skinBidClient = new SkinBidClient();
        while (true) {
            List<FullAuction> auctionList = skinBidClient.getAllRunningAuctions();
            if (auctionHashToFullAuction.isEmpty()) {
                auctionList.forEach(fullAuction -> {
                    auctionHashToFullAuction.put(fullAuction.getAuction().getAuctionHash(), fullAuction);
                });
            }
            auctionList.stream().filter(x -> x.getBids().size() > 0).forEach(fullAuction -> {
                boolean sendEmbed = false;
                String auctionHash = fullAuction.getAuction().getAuctionHash();
                if (auctionHashToFullAuction.containsKey(auctionHash)) {
                    if (!auctionHashToFullAuction.get(auctionHash).equals(fullAuction)) {
                        sendEmbed = true;
                    }
                } else {
                    sendEmbed = true;
                }

                auctionHashToFullAuction.put(auctionHash, fullAuction);
                if (sendEmbed) {
                    System.out.println("Change detected for: " + fullAuction);
                    if (auctionHashToMessage.containsKey(auctionHash)) {
                        editMessage(auctionHash, fullAuction);
                        auctionHashToListeners.get(auctionHashToMessage.get(auctionHash)).forEach(user -> {
                            sendMessageToUser(fullAuction, user);
                        });

                    } else {
                        Snowflake messageId = sendMessage(fullAuction);
                        if (!messageId.equals(Snowflake.of(0))) {
                            auctionHashToMessage.put(auctionHash, messageId);
                        }
                    }
                }

            });
            List<String> hashes = auctionList.stream().map(fullAuction -> fullAuction.getAuction().getAuctionHash()).collect(Collectors.toList());
            List<String> hashesToRemove = new ArrayList<>();
            auctionHashToMessage.keySet().forEach(key -> {
                if (!hashes.contains(key)) {
                    hashesToRemove.add(key);
                }
            });
            hashesToRemove.forEach(hash -> {
                Snowflake snowflake = auctionHashToMessage.get(hash);
                auctionHashToMessage.remove(hash);
                auctionHashToFullAuction.remove(snowflake);
                auctionHashToListeners.remove(snowflake);
            });


            try {
                Thread.sleep(1000 * 30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void editMessage(String auctionHash, FullAuction fullAuction) {
        Snowflake messageId = auctionHashToMessage.get(auctionHash);
        Message message = discordClient.getMessageById(POST_CHANNEL, messageId).block();
        if (message != null) {
            message.getRestMessage().edit(MessageEditRequest.builder().embedOrNull(fullAuctionToEmbed(fullAuction, REACTION_ID, REACTION_NAME)).build()).block();
        }
    }

    private Snowflake sendMessage(FullAuction fullAuction) {
        Channel channel = discordClient.getChannelById(POST_CHANNEL).block();
        if (channel != null) {
            Snowflake snowflake = Snowflake.of(channel.getRestChannel().createMessage(fullAuctionToEmbed(fullAuction, REACTION_ID, REACTION_NAME)).block().id().asLong());
            addReactionToMessage(snowflake);
            return snowflake;
        }
        return Snowflake.of(0);
    }

    private void sendMessageToUser(FullAuction fullAuction, User user) {
        Member member = user.asMember(GUILD).block();
        if (member != null) {
            PrivateChannel privateChannel = member.getPrivateChannel().block();
            if (privateChannel != null) {
                privateChannel.getRestChannel().createMessage(fullAuctionToEmbed(fullAuction, null, null)).block();
            }
        }
    }

    private void addReactionToMessage(Snowflake messageId) {
        Message message = discordClient.getMessageById(POST_CHANNEL, messageId).block();
        if (message != null) {
            message.addReaction(ReactionEmoji.of(REACTION_ID.asLong(), REACTION_NAME, REACTION_ANIMATED)).block();
        }
    }

}
