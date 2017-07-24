package ru.bk.klim9.imagesearcher.repository;

import android.location.Location;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;
import ru.arturvasilov.rxloader.RxUtils;
import ru.bk.klim9.imagesearcher.api.ApiFactory;
import ru.bk.klim9.imagesearcher.content.Image;
import ru.bk.klim9.imagesearcher.content.ImagesResponse;
import rx.Observable;

/**
 * @author Ivan
 */
public class DefaultGettyimagesRepository implements GettyimagesRepository {

    @NonNull
    @Override
    public Observable<List<Image>> images(String api_key, String phrase, Location location) {
        return ApiFactory.getGithubService()
                .images(api_key, phrase)
                .map(ImagesResponse::getImages)
                .map(this::getTrimmedList)
                .flatMap(images -> {
                    Realm.getDefaultInstance().executeTransaction(realm -> {
                        for (Image image: images){
                            image.setPhrase(phrase);
                            if (location != null){
                                image.setLat(String.valueOf(location.getLatitude()));
                                image.setLon(String.valueOf(location.getLongitude()));
                            }
                            realm.copyToRealmOrUpdate(image);
                        }
                    });
                    return Observable.just(images);
                })
                .onErrorResumeNext(throwable -> {
                    Realm realm = Realm.getDefaultInstance();
                    RealmResults<Image> images = realm.where(Image.class).equalTo("phrase", phrase).findAll();
                    return Observable.just(realm.copyFromRealm(images));
                })
                .compose(RxUtils.async());
    }

    private List<Image> getTrimmedList(List<Image> startList){
        if (startList.size() > 10){
            List<Image> trimmedList = new ArrayList<>();
            trimmedList = startList.subList(0, 10);
            return trimmedList;
        } else {
            return startList;
        }
    }

}
