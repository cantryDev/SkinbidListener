
package de.cantry.skinbidlistener.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SkinBidAuctionsResponse {

    @SerializedName("totalItems")
    @Expose
    private Long totalItems;
    @SerializedName("maximumPrice")
    @Expose
    private Float maximumPrice;
    @SerializedName("items")
    @Expose
    private List<FullAuction> fullAuctions = null;

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public Float getMaximumPrice() {
        return maximumPrice;
    }

    public void setMaximumPrice(Float maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    public List<FullAuction> getFullAuctions() {
        return fullAuctions;
    }

    public void setFullAuctions(List<FullAuction> fullAuctions) {
        this.fullAuctions = fullAuctions;
    }

}
