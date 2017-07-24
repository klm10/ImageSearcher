
package ru.bk.klim9.imagesearcher.content;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class DisplaySize extends RealmObject{

    @SerializedName("is_watermarked")
    @Expose
    private boolean isWatermarked;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("uri")
    @Expose
    private String uri;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DisplaySize() {
    }

    /**
     * 
     * @param isWatermarked
     * @param name
     * @param uri
     */
    public DisplaySize(boolean isWatermarked, String name, String uri) {
        super();
        this.isWatermarked = isWatermarked;
        this.name = name;
        this.uri = uri;
    }

    public boolean isIsWatermarked() {
        return isWatermarked;
    }

    public void setIsWatermarked(boolean isWatermarked) {
        this.isWatermarked = isWatermarked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}
