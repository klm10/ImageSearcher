
package ru.bk.klim9.imagesearcher.content;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class MaxDimensions extends RealmObject{

    @SerializedName("height")
    @Expose
    private float height;
    @SerializedName("width")
    @Expose
    private float width;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MaxDimensions() {
    }

    /**
     * 
     * @param height
     * @param width
     */
    public MaxDimensions(float height, float width) {
        super();
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

}
