package ru.bk.klim9.imagesearcher.util;

import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ru.bk.klim9.imagesearcher.AppDelegate;
import ru.bk.klim9.imagesearcher.content.Image;

/**
 * @author Ivan
 */
public final class ImagesUtil {

    public static final String WIDTH_185 = "w185";
    public static final String WIDTH_780 = "w780";

    private ImagesUtil() {
    }

    public static void loadMovie(@NonNull ImageView imageView, @NonNull Image image,
                                 @NonNull String size) {
        loadMovie(imageView, image.getDisplaySizes().get(0).getUri(), size);
    }

    public static void loadMovie(@NonNull ImageView imageView, @NonNull String posterPath,
                                 @NonNull String size) {
        String url = posterPath;
        Picasso.with(imageView.getContext())
                .load(url)
                .noFade()
                .into(imageView);
    }

    public static void fetch(@NonNull String posterPath, @NonNull String size) {
        String url = posterPath;
        Picasso.with(AppDelegate.getContext())
                .load(url)
                .fetch();
    }
}
