
package de.cantry.skinbidlistener.response;

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemInfo {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("wearName")
    @Expose
    private String wearName;
    @SerializedName("inspectLink")
    @Expose
    private String inspectLink;
    @SerializedName("marketInspectLink")
    @Expose
    private String marketInspectLink;
    @SerializedName("float")
    @Expose
    private Float _float;
    @SerializedName("fade")
    @Expose
    private Float fade;
    @SerializedName("paintSeed")
    @Expose
    private Long paintSeed;
    @SerializedName("paintIndex")
    @Expose
    private Long paintIndex;
    @SerializedName("defIndex")
    @Expose
    private Long defIndex;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("subCategory")
    @Expose
    private String subCategory;
    @SerializedName("rarity")
    @Expose
    private Long rarity;
    @SerializedName("quality")
    @Expose
    private Long quality;
    @SerializedName("isStatTrak")
    @Expose
    private Boolean isStatTrak;
    @SerializedName("stickers")
    @Expose
    private List<Sticker> stickers = null;
    @SerializedName("itemId")
    @Expose
    private Object itemId;
    @SerializedName("dopplerPhase")
    @Expose
    private Object dopplerPhase;
    @SerializedName("assetId")
    @Expose
    private String assetId;
    @SerializedName("instanceId")
    @Expose
    private String instanceId;
    @SerializedName("classId")
    @Expose
    private String classId;
    @SerializedName("hasScreenshot")
    @Expose
    private Boolean hasScreenshot;
    @SerializedName("screenshotUrl")
    @Expose
    private Object screenshotUrl;
    @SerializedName("fireIce")
    @Expose
    private Object fireIce;
    @SerializedName("isRarePattern")
    @Expose
    private Boolean isRarePattern;
    @SerializedName("isHighStickerValue")
    @Expose
    private Boolean isHighStickerValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getWearName() {
        return wearName;
    }

    public void setWearName(String wearName) {
        this.wearName = wearName;
    }

    public String getInspectLink() {
        return inspectLink;
    }

    public void setInspectLink(String inspectLink) {
        this.inspectLink = inspectLink;
    }

    public String getMarketInspectLink() {
        return marketInspectLink;
    }

    public void setMarketInspectLink(String marketInspectLink) {
        this.marketInspectLink = marketInspectLink;
    }

    public Float getFloat() {
        return _float;
    }

    public void setFloat(Float _float) {
        this._float = _float;
    }

    public Float getFade() {
        return fade;
    }

    public void setFade(Float fade) {
        this.fade = fade;
    }

    public Long getPaintSeed() {
        return paintSeed;
    }

    public void setPaintSeed(Long paintSeed) {
        this.paintSeed = paintSeed;
    }

    public Long getPaintIndex() {
        return paintIndex;
    }

    public void setPaintIndex(Long paintIndex) {
        this.paintIndex = paintIndex;
    }

    public Long getDefIndex() {
        return defIndex;
    }

    public void setDefIndex(Long defIndex) {
        this.defIndex = defIndex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Long getRarity() {
        return rarity;
    }

    public void setRarity(Long rarity) {
        this.rarity = rarity;
    }

    public Long getQuality() {
        return quality;
    }

    public void setQuality(Long quality) {
        this.quality = quality;
    }

    public Boolean getIsStatTrak() {
        return isStatTrak;
    }

    public void setIsStatTrak(Boolean isStatTrak) {
        this.isStatTrak = isStatTrak;
    }

    public List<Sticker> getStickers() {
        return stickers;
    }

    public void setStickers(List<Sticker> stickers) {
        this.stickers = stickers;
    }

    public Object getItemId() {
        return itemId;
    }

    public void setItemId(Object itemId) {
        this.itemId = itemId;
    }

    public Object getDopplerPhase() {
        return dopplerPhase;
    }

    public void setDopplerPhase(Object dopplerPhase) {
        this.dopplerPhase = dopplerPhase;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Boolean getHasScreenshot() {
        return hasScreenshot;
    }

    public void setHasScreenshot(Boolean hasScreenshot) {
        this.hasScreenshot = hasScreenshot;
    }

    public Object getScreenshotUrl() {
        return screenshotUrl;
    }

    public void setScreenshotUrl(Object screenshotUrl) {
        this.screenshotUrl = screenshotUrl;
    }

    public Object getFireIce() {
        return fireIce;
    }

    public void setFireIce(Object fireIce) {
        this.fireIce = fireIce;
    }

    public Boolean getIsRarePattern() {
        return isRarePattern;
    }

    public void setIsRarePattern(Boolean isRarePattern) {
        this.isRarePattern = isRarePattern;
    }

    public Boolean getIsHighStickerValue() {
        return isHighStickerValue;
    }

    public void setIsHighStickerValue(Boolean isHighStickerValue) {
        this.isHighStickerValue = isHighStickerValue;
    }

    @Override
    public String toString() {
        return "ItemInfo{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", wearName='" + wearName + '\'' +
                ", inspectLink='" + inspectLink + '\'' +
                ", marketInspectLink='" + marketInspectLink + '\'' +
                ", _float=" + _float +
                ", fade=" + fade +
                ", paintSeed=" + paintSeed +
                ", paintIndex=" + paintIndex +
                ", defIndex=" + defIndex +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", rarity=" + rarity +
                ", quality=" + quality +
                ", isStatTrak=" + isStatTrak +
                ", stickers=" + stickers +
                ", itemId=" + itemId +
                ", dopplerPhase=" + dopplerPhase +
                ", assetId='" + assetId + '\'' +
                ", instanceId='" + instanceId + '\'' +
                ", classId='" + classId + '\'' +
                ", hasScreenshot=" + hasScreenshot +
                ", screenshotUrl=" + screenshotUrl +
                ", fireIce=" + fireIce +
                ", isRarePattern=" + isRarePattern +
                ", isHighStickerValue=" + isHighStickerValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemInfo itemInfo = (ItemInfo) o;
        return Objects.equals(name, itemInfo.name) && Objects.equals(fullName, itemInfo.fullName) && Objects.equals(imageUrl, itemInfo.imageUrl) && Objects.equals(wearName, itemInfo.wearName) && Objects.equals(inspectLink, itemInfo.inspectLink) && Objects.equals(marketInspectLink, itemInfo.marketInspectLink) && Objects.equals(_float, itemInfo._float) && Objects.equals(fade, itemInfo.fade) && Objects.equals(paintSeed, itemInfo.paintSeed) && Objects.equals(paintIndex, itemInfo.paintIndex) && Objects.equals(defIndex, itemInfo.defIndex) && Objects.equals(type, itemInfo.type) && Objects.equals(category, itemInfo.category) && Objects.equals(subCategory, itemInfo.subCategory) && Objects.equals(rarity, itemInfo.rarity) && Objects.equals(quality, itemInfo.quality) && Objects.equals(isStatTrak, itemInfo.isStatTrak) && Objects.equals(stickers, itemInfo.stickers) && Objects.equals(itemId, itemInfo.itemId) && Objects.equals(dopplerPhase, itemInfo.dopplerPhase) && Objects.equals(assetId, itemInfo.assetId) && Objects.equals(instanceId, itemInfo.instanceId) && Objects.equals(classId, itemInfo.classId) && Objects.equals(hasScreenshot, itemInfo.hasScreenshot) && Objects.equals(screenshotUrl, itemInfo.screenshotUrl) && Objects.equals(fireIce, itemInfo.fireIce) && Objects.equals(isRarePattern, itemInfo.isRarePattern) && Objects.equals(isHighStickerValue, itemInfo.isHighStickerValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fullName, imageUrl, wearName, inspectLink, marketInspectLink, _float, fade, paintSeed, paintIndex, defIndex, type, category, subCategory, rarity, quality, isStatTrak, stickers, itemId, dopplerPhase, assetId, instanceId, classId, hasScreenshot, screenshotUrl, fireIce, isRarePattern, isHighStickerValue);
    }
}
