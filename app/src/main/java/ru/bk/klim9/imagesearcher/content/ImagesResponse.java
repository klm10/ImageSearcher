
package ru.bk.klim9.imagesearcher.content;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;

public class ImagesResponse {

    @SerializedName("result_count")
    @Expose
    private float resultCount;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImagesResponse() {
    }

    /**
     * 
     * @param resultCount
     * @param images
     */
    public ImagesResponse(float resultCount, RealmList<Image> images) {
        super();
        this.resultCount = resultCount;
        this.images = images;
    }

    public float getResultCount() {
        return resultCount;
    }

    public void setResultCount(float resultCount) {
        this.resultCount = resultCount;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

}
