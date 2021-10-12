
package de.cantry.skinbidlistener.response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Sticker {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("stickerId")
    @Expose
    private Long stickerId;
    @SerializedName("slot")
    @Expose
    private Long slot;
    @SerializedName("codeName")
    @Expose
    private String codeName;
    @SerializedName("material")
    @Expose
    private String material;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("wear")
    @Expose
    private Float wear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStickerId() {
        return stickerId;
    }

    public void setStickerId(Long stickerId) {
        this.stickerId = stickerId;
    }

    public Long getSlot() {
        return slot;
    }

    public void setSlot(Long slot) {
        this.slot = slot;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Float getWear() {
        return wear;
    }

    public void setWear(Float wear) {
        this.wear = wear;
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "id=" + id +
                ", stickerId=" + stickerId +
                ", slot=" + slot +
                ", codeName='" + codeName + '\'' +
                ", material='" + material + '\'' +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", wear=" + wear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sticker sticker = (Sticker) o;
        return Objects.equals(id, sticker.id) && Objects.equals(stickerId, sticker.stickerId) && Objects.equals(slot, sticker.slot) && Objects.equals(codeName, sticker.codeName) && Objects.equals(material, sticker.material) && Objects.equals(name, sticker.name) && Objects.equals(imageUrl, sticker.imageUrl) && Objects.equals(wear, sticker.wear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stickerId, slot, codeName, material, name, imageUrl, wear);
    }
}
