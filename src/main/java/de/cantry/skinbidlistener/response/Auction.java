
package de.cantry.skinbidlistener.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Auction {

    @SerializedName("auctionHash")
    @Expose
    private String auctionHash;
    @SerializedName("auctionName")
    @Expose
    private Object auctionName;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("isBundle")
    @Expose
    private Boolean isBundle;
    @SerializedName("hasBuyNow")
    @Expose
    private Boolean hasBuyNow;
    @SerializedName("bundleId")
    @Expose
    private Long bundleId;
    @SerializedName("buyNowPrice")
    @Expose
    private Object buyNowPrice;
    @SerializedName("startBid")
    @Expose
    private Float startBid;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("runtime")
    @Expose
    private String runtime;
    @SerializedName("auctionType")
    @Expose
    private String auctionType;
    @SerializedName("winnerSteamId")
    @Expose
    private Object winnerSteamId;

    public String getAuctionHash() {
        return auctionHash;
    }

    public void setAuctionHash(String auctionHash) {
        this.auctionHash = auctionHash;
    }

    public Object getAuctionName() {
        return auctionName;
    }

    public void setAuctionName(Object auctionName) {
        this.auctionName = auctionName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsBundle() {
        return isBundle;
    }

    public void setIsBundle(Boolean isBundle) {
        this.isBundle = isBundle;
    }

    public Boolean getHasBuyNow() {
        return hasBuyNow;
    }

    public void setHasBuyNow(Boolean hasBuyNow) {
        this.hasBuyNow = hasBuyNow;
    }

    public Long getBundleId() {
        return bundleId;
    }

    public void setBundleId(Long bundleId) {
        this.bundleId = bundleId;
    }

    public Object getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(Object buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    public Float getStartBid() {
        return startBid;
    }

    public void setStartBid(Float startBid) {
        this.startBid = startBid;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getAuctionType() {
        return auctionType;
    }

    public void setAuctionType(String auctionType) {
        this.auctionType = auctionType;
    }

    public Object getWinnerSteamId() {
        return winnerSteamId;
    }

    public void setWinnerSteamId(Object winnerSteamId) {
        this.winnerSteamId = winnerSteamId;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "auctionHash='" + auctionHash + '\'' +
                ", auctionName=" + auctionName +
                ", isActive=" + isActive +
                ", isBundle=" + isBundle +
                ", hasBuyNow=" + hasBuyNow +
                ", bundleId=" + bundleId +
                ", buyNowPrice=" + buyNowPrice +
                ", startBid=" + startBid +
                ", created='" + created + '\'' +
                ", endDate='" + endDate + '\'' +
                ", runtime='" + runtime + '\'' +
                ", auctionType='" + auctionType + '\'' +
                ", winnerSteamId=" + winnerSteamId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auction auction = (Auction) o;
        return Objects.equals(auctionHash, auction.auctionHash) && Objects.equals(auctionName, auction.auctionName) && Objects.equals(isActive, auction.isActive) && Objects.equals(isBundle, auction.isBundle) && Objects.equals(hasBuyNow, auction.hasBuyNow) && Objects.equals(bundleId, auction.bundleId) && Objects.equals(buyNowPrice, auction.buyNowPrice) && Objects.equals(startBid, auction.startBid) && Objects.equals(created, auction.created) && Objects.equals(endDate, auction.endDate) && Objects.equals(runtime, auction.runtime) && Objects.equals(auctionType, auction.auctionType) && Objects.equals(winnerSteamId, auction.winnerSteamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auctionHash, auctionName, isActive, isBundle, hasBuyNow, bundleId, buyNowPrice, startBid, created, endDate, runtime, auctionType, winnerSteamId);
    }
}
