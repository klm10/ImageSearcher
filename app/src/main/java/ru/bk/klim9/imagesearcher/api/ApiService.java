package ru.bk.klim9.imagesearcher.api;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.bk.klim9.imagesearcher.Constants;
import ru.bk.klim9.imagesearcher.content.ImagesResponse;
import rx.Observable;


/**
 * @author Ivan
 */
public interface ApiService {

    @GET("/v3/search/images")
    Observable<ImagesResponse> images(@Header("Api-Key") String api_key, @Query("phrase") String phrase);


}
