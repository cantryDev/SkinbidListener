package de.cantry.skinbidlistener;

import de.cantry.skinbidlistener.response.FullAuction;
import de.cantry.skinbidlistener.response.FullItem;
import discord4j.common.util.Snowflake;
import discord4j.core.spec.EmbedCreateSpec;
import discord4j.discordjson.json.EmbedData;
import discord4j.rest.util.Color;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static EmbedData fullAuctionToEmbed(FullAuction fullAuction, Snowflake emoji, String emojiName) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime endDate = LocalDateTime.parse(fullAuction.getAuction().getEndDate(), formatter);
        EmbedCreateSpec.Builder embed = EmbedCreateSpec.builder();
        embed.color(Color.BLUE)
                .title("View auction on skinbid")
                .url("https://skinbid.com/auctions/" + fullAuction.getAuction().getAuctionHash())
                .addField("Currentprice", fullAuction.getCurrentHighestBid() + "€ after " + fullAuction.getBids().size() + " bid(s)", false)
                .addField("Minimum next bid", fullAuction.getNextMinimumBid() + "", false)
                .addField("Ending", String.format("<t:%1$s:R>", endDate.toInstant(ZoneOffset.UTC).getEpochSecond()), false)
                .addField("End date", String.format("<t:%1$s:F>", endDate.toInstant(ZoneOffset.UTC).getEpochSecond()), false)
                .addField("Items:", fullAuction.getFullItems().size() + "", false);
        for (int i = 0; i < fullAuction.getFullItems().size(); i++) {
            FullItem fullItem = fullAuction.getFullItems().get(i);

            embed.addField("Item #" + (i + 1), fullItem.getItemInfo().getFullName(), false);
            if (fullItem.getItemInfo().getHasScreenshot()) {
                embed.image((String) fullItem.getItemInfo().getScreenshotUrl());
            } else {
                embed.image(fullItem.getItemInfo().getImageUrl());
            }
            if (fullItem.getItemInfo().getStickers().size() > 0) {
                StringBuilder stickers = new StringBuilder();
                fullItem.getItemInfo().getStickers().forEach(sticker -> {
                    stickers.append(sticker.getName()).append(" (").append(100 - sticker.getWear() * 100).append("%) at slot ").append(sticker.getSlot()).append("\r");
                });
                embed.addField("Stickers on:" + fullItem.getItemInfo().getFullName(), stickers.toString(), false);
            }
        }
        if (emoji != null) {
            embed.addField("React to receive updates per direct message", String.format("<:%1$s:%2$s>", emojiName, emoji.asLong()),false);
        }
        embed.timestamp(Instant.now())
                .footer("skinbid.com", null);

        return embed.build().asRequest();
    }

}
