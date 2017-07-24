package ru.bk.klim9.imagesearcher.repository;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;

/**
 * @author Ivan
 */
public final class RepositoryProvider {

    private static GettyimagesRepository sGettyimagesRepository;

    private RepositoryProvider() {
    }

    @NonNull
    public static GettyimagesRepository provideGithubRepository() {
        if (sGettyimagesRepository == null) {
            sGettyimagesRepository = new DefaultGettyimagesRepository();
        }
        return sGettyimagesRepository;
    }

    public static void setGithubRepository(@NonNull GettyimagesRepository gettyimagesRepository) {
        sGettyimagesRepository = gettyimagesRepository;
    }

    @MainThread
    public static void init() {
        sGettyimagesRepository = new DefaultGettyimagesRepository();
    }
}
