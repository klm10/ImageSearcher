package ru.bk.klim9.imagesearcher.screens.search;

import android.support.annotation.NonNull;

import java.util.List;

import io.realm.RealmResults;
import ru.bk.klim9.imagesearcher.content.Image;
import ru.bk.klim9.imagesearcher.content.ImagesResponse;
import ru.bk.klim9.imagesearcher.screens.general.LoadingView;

/**
 * @author Ivan
 */

public interface SearchView extends LoadingView{

    void showImages(List<Image> images);

    void showError();

}
