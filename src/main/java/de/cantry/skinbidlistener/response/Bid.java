
package de.cantry.skinbidlistener.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Bid {

    @SerializedName("amount")
    @Expose
    private Float amount;
    @SerializedName("bidderId")
    @Expose
    private Long bidderId;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("yourBid")
    @Expose
    private Boolean yourBid;

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Long getBidderId() {
        return bidderId;
    }

    public void setBidderId(Long bidderId) {
        this.bidderId = bidderId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Boolean getYourBid() {
        return yourBid;
    }

    public void setYourBid(Boolean yourBid) {
        this.yourBid = yourBid;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "amount=" + amount +
                ", bidderId=" + bidderId +
                ", created='" + created + '\'' +
                ", yourBid=" + yourBid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bid bid = (Bid) o;
        return Objects.equals(amount, bid.amount) && Objects.equals(bidderId, bid.bidderId) && Objects.equals(created, bid.created) && Objects.equals(yourBid, bid.yourBid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, bidderId, created, yourBid);
    }
}
