
package de.cantry.skinbidlistener.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class SkbMeta {

    @SerializedName("recommendPrice")
    @Expose
    private Object recommendPrice;
    @SerializedName("currentMarketPrice")
    @Expose
    private Object currentMarketPrice;
    @SerializedName("isHighStickerValue")
    @Expose
    private Boolean isHighStickerValue;
    @SerializedName("isRarePattern")
    @Expose
    private Boolean isRarePattern;
    @SerializedName("currency")
    @Expose
    private Object currency;

    public Object getRecommendPrice() {
        return recommendPrice;
    }

    public void setRecommendPrice(Object recommendPrice) {
        this.recommendPrice = recommendPrice;
    }

    public Object getCurrentMarketPrice() {
        return currentMarketPrice;
    }

    public void setCurrentMarketPrice(Object currentMarketPrice) {
        this.currentMarketPrice = currentMarketPrice;
    }

    public Boolean getIsHighStickerValue() {
        return isHighStickerValue;
    }

    public void setIsHighStickerValue(Boolean isHighStickerValue) {
        this.isHighStickerValue = isHighStickerValue;
    }

    public Boolean getIsRarePattern() {
        return isRarePattern;
    }

    public void setIsRarePattern(Boolean isRarePattern) {
        this.isRarePattern = isRarePattern;
    }

    public Object getCurrency() {
        return currency;
    }

    public void setCurrency(Object currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "SkbMeta{" +
                "recommendPrice=" + recommendPrice +
                ", currentMarketPrice=" + currentMarketPrice +
                ", isHighStickerValue=" + isHighStickerValue +
                ", isRarePattern=" + isRarePattern +
                ", currency=" + currency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkbMeta skbMeta = (SkbMeta) o;
        return Objects.equals(recommendPrice, skbMeta.recommendPrice) && Objects.equals(currentMarketPrice, skbMeta.currentMarketPrice) && Objects.equals(isHighStickerValue, skbMeta.isHighStickerValue) && Objects.equals(isRarePattern, skbMeta.isRarePattern) && Objects.equals(currency, skbMeta.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendPrice, currentMarketPrice, isHighStickerValue, isRarePattern, currency);
    }
}
