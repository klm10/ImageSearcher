
package ru.bk.klim9.imagesearcher.content;

import android.location.Location;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Image extends RealmObject{

    @SerializedName("id")
    @Expose
    @PrimaryKey
    private String id;
    @SerializedName("asset_family")
    @Expose
    private String assetFamily;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("collection_code")
    @Expose
    private String collectionCode;
    @SerializedName("collection_id")
    @Expose
    private float collectionId;
    @SerializedName("collection_name")
    @Expose
    private String collectionName;
    @SerializedName("display_sizes")
    @Expose
    private RealmList<DisplaySize> displaySizes = null;
    @SerializedName("license_model")
    @Expose
    private String licenseModel;
    @SerializedName("max_dimensions")
    @Expose
    private MaxDimensions maxDimensions;
    @SerializedName("title")
    @Expose
    private String title;

    private String phrase;

    private String lat;

    private String lon;

    private String date;


    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param id
     * @param title
     * @param collectionId
     * @param maxDimensions
     * @param licenseModel
     * @param caption
     * @param assetFamily
     * @param displaySizes
     * @param collectionName
     * @param collectionCode
     */
    public Image(String id, String assetFamily, String caption, String collectionCode, float collectionId, String collectionName, RealmList<DisplaySize> displaySizes, String licenseModel, MaxDimensions maxDimensions, String title) {
        super();
        this.id = id;
        this.assetFamily = assetFamily;
        this.caption = caption;
        this.collectionCode = collectionCode;
        this.collectionId = collectionId;
        this.collectionName = collectionName;
        this.displaySizes = displaySizes;
        this.licenseModel = licenseModel;
        this.maxDimensions = maxDimensions;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAssetFamily() {
        return assetFamily;
    }

    public void setAssetFamily(String assetFamily) {
        this.assetFamily = assetFamily;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCollectionCode() {
        return collectionCode;
    }

    public void setCollectionCode(String collectionCode) {
        this.collectionCode = collectionCode;
    }

    public float getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(float collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public RealmList<DisplaySize> getDisplaySizes() {
        return displaySizes;
    }

    public void setDisplaySizes(RealmList<DisplaySize> displaySizes) {
        this.displaySizes = displaySizes;
    }

    public String getLicenseModel() {
        return licenseModel;
    }

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    public MaxDimensions getMaxDimensions() {
        return maxDimensions;
    }

    public void setMaxDimensions(MaxDimensions maxDimensions) {
        this.maxDimensions = maxDimensions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
