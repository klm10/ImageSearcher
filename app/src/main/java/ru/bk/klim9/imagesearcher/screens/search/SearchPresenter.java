package ru.bk.klim9.imagesearcher.screens.search;

import android.location.Location;
import android.support.annotation.NonNull;

import ru.arturvasilov.rxloader.LifecycleHandler;
import ru.bk.klim9.imagesearcher.R;
import ru.bk.klim9.imagesearcher.repository.RepositoryProvider;

import static ru.bk.klim9.imagesearcher.Constants.API_KEY_EMBED;

/**
 * @author Ivan
 */

public class SearchPresenter {

    private final LifecycleHandler mLifecycleHandler;
    private final SearchView mView;

    public SearchPresenter(@NonNull LifecycleHandler lifecycleHandler,
                                 @NonNull SearchView view) {
        mLifecycleHandler = lifecycleHandler;
        mView = view;
    }

    public void init(String phrase, boolean reload, Location location) {
        RepositoryProvider.provideGithubRepository()
                .images(API_KEY_EMBED, phrase, location)
                .doOnSubscribe(mView::showLoading)
                .doOnTerminate(mView::hideLoading)
                .compose(reload ? mLifecycleHandler.reload(R.id.repositories_request) : mLifecycleHandler.load(R.id.repositories_request))
                .subscribe(mView::showImages, throwable -> mView.showError());
    }

}
