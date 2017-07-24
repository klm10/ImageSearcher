package ru.bk.klim9.imagesearcher.repository;

import android.location.Location;
import android.support.annotation.NonNull;

import java.util.List;

import ru.bk.klim9.imagesearcher.content.Image;
import ru.bk.klim9.imagesearcher.content.ImagesResponse;
import rx.Observable;

/**
 * @author Ivan
 */
public interface GettyimagesRepository {
    
    @NonNull
    Observable<List<Image>> images(String api_key, String phrase, Location location);

}
