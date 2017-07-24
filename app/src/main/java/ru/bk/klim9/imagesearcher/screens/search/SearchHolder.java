package ru.bk.klim9.imagesearcher.screens.search;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.bk.klim9.imagesearcher.R;
import ru.bk.klim9.imagesearcher.content.Image;
import ru.bk.klim9.imagesearcher.util.ImagesUtil;

/**
 * @author Ivan
 */
public class SearchHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.image)
    ImageView mImageView;

    @BindView(R.id.tvLat1)
    TextView tvLat;

    @BindView(R.id.tvLon1)
    TextView tvLon;

    @NonNull
    public static SearchHolder create(@NonNull Context context, int imageHeight, int imageWidth) {
        View view = View.inflate(context, R.layout.image_item, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = imageHeight;
        layoutParams.width = imageWidth;
        imageView.requestLayout();
        return new SearchHolder(view);
    }

    private SearchHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(@NonNull Image image) {
        ImagesUtil.loadMovie(mImageView, image, "");
        tvLat.setText("Lat " + image.getLat());
        tvLon.setText("Lon " + image.getLon());
    }
}
