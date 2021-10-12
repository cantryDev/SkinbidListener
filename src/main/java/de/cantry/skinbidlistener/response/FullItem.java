
package de.cantry.skinbidlistener.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class FullItem {

    @SerializedName("itemHash")
    @Expose
    private String itemHash;
    @SerializedName("isTradeLocked")
    @Expose
    private Boolean isTradeLocked;
    @SerializedName("tradeLockExpireDate")
    @Expose
    private Object tradeLockExpireDate;
    @SerializedName("isOnAuction")
    @Expose
    private Boolean isOnAuction;
    @SerializedName("auctionHash")
    @Expose
    private String auctionHash;
    @SerializedName("skbMeta")
    @Expose
    private SkbMeta skbMeta;
    @SerializedName("item")
    @Expose
    private ItemInfo itemInfo;

    public String getItemHash() {
        return itemHash;
    }

    public void setItemHash(String itemHash) {
        this.itemHash = itemHash;
    }

    public Boolean getIsTradeLocked() {
        return isTradeLocked;
    }

    public void setIsTradeLocked(Boolean isTradeLocked) {
        this.isTradeLocked = isTradeLocked;
    }

    public Object getTradeLockExpireDate() {
        return tradeLockExpireDate;
    }

    public void setTradeLockExpireDate(Object tradeLockExpireDate) {
        this.tradeLockExpireDate = tradeLockExpireDate;
    }

    public Boolean getIsOnAuction() {
        return isOnAuction;
    }

    public void setIsOnAuction(Boolean isOnAuction) {
        this.isOnAuction = isOnAuction;
    }

    public String getAuctionHash() {
        return auctionHash;
    }

    public void setAuctionHash(String auctionHash) {
        this.auctionHash = auctionHash;
    }

    public SkbMeta getSkbMeta() {
        return skbMeta;
    }

    public void setSkbMeta(SkbMeta skbMeta) {
        this.skbMeta = skbMeta;
    }

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    @Override
    public String toString() {
        return "FullItem{" +
                "itemHash='" + itemHash + '\'' +
                ", isTradeLocked=" + isTradeLocked +
                ", tradeLockExpireDate=" + tradeLockExpireDate +
                ", isOnAuction=" + isOnAuction +
                ", auctionHash='" + auctionHash + '\'' +
                ", skbMeta=" + skbMeta +
                ", itemInfo=" + itemInfo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullItem fullItem = (FullItem) o;
        return Objects.equals(itemHash, fullItem.itemHash) && Objects.equals(isTradeLocked, fullItem.isTradeLocked) && Objects.equals(tradeLockExpireDate, fullItem.tradeLockExpireDate) && Objects.equals(isOnAuction, fullItem.isOnAuction) && Objects.equals(auctionHash, fullItem.auctionHash) && Objects.equals(skbMeta, fullItem.skbMeta) && Objects.equals(itemInfo, fullItem.itemInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemHash, isTradeLocked, tradeLockExpireDate, isOnAuction, auctionHash, skbMeta, itemInfo);
    }
}
