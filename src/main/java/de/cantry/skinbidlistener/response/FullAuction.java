
package de.cantry.skinbidlistener.response;

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FullAuction {

    @SerializedName("currentHighestBid")
    @Expose
    private Float currentHighestBid;
    @SerializedName("nextMinimumBid")
    @Expose
    private Float nextMinimumBid;
    @SerializedName("numberOfBids")
    @Expose
    private Long numberOfBids;
    @SerializedName("isUserSeller")
    @Expose
    private Boolean isUserSeller;
    @SerializedName("auction")
    @Expose
    private Auction auction;
    @SerializedName("items")
    @Expose
    private List<FullItem> fullItems = null;
    @SerializedName("bids")
    @Expose
    private List<Bid> bids = null;
    @SerializedName("trade")
    @Expose
    private Object trade;

    public Float getCurrentHighestBid() {
        return currentHighestBid;
    }

    public void setCurrentHighestBid(Float currentHighestBid) {
        this.currentHighestBid = currentHighestBid;
    }

    public Float getNextMinimumBid() {
        return nextMinimumBid;
    }

    public void setNextMinimumBid(Float nextMinimumBid) {
        this.nextMinimumBid = nextMinimumBid;
    }

    public Long getNumberOfBids() {
        return numberOfBids;
    }

    public void setNumberOfBids(Long numberOfBids) {
        this.numberOfBids = numberOfBids;
    }

    public Boolean getIsUserSeller() {
        return isUserSeller;
    }

    public void setIsUserSeller(Boolean isUserSeller) {
        this.isUserSeller = isUserSeller;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public List<FullItem> getFullItems() {
        return fullItems;
    }

    public void setFullItems(List<FullItem> fullItems) {
        this.fullItems = fullItems;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    public Object getTrade() {
        return trade;
    }

    public void setTrade(Object trade) {
        this.trade = trade;
    }

    @Override
    public String toString() {
        return "FullAuction{" +
                "currentHighestBid=" + currentHighestBid +
                ", nextMinimumBid=" + nextMinimumBid +
                ", numberOfBids=" + numberOfBids +
                ", isUserSeller=" + isUserSeller +
                ", auction=" + auction +
                ", fullItems=" + fullItems +
                ", bids=" + bids +
                ", trade=" + trade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullAuction auction1 = (FullAuction) o;
        return Objects.equals(currentHighestBid, auction1.currentHighestBid) && Objects.equals(nextMinimumBid, auction1.nextMinimumBid) && Objects.equals(numberOfBids, auction1.numberOfBids) && Objects.equals(isUserSeller, auction1.isUserSeller) && Objects.equals(auction, auction1.auction) && Objects.equals(fullItems, auction1.fullItems) && Objects.equals(bids, auction1.bids) && Objects.equals(trade, auction1.trade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentHighestBid, nextMinimumBid, numberOfBids, isUserSeller, auction, fullItems, bids, trade);
    }
}
