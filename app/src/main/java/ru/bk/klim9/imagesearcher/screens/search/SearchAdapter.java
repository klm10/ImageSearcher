package ru.bk.klim9.imagesearcher.screens.search;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.bk.klim9.imagesearcher.content.Image;

/**
 * @author Artur Vasilov
 */
public class SearchAdapter extends RecyclerView.Adapter<SearchHolder> {

    private final List<Image> mImages;
    private final int mImageHeight;
    private final int mImageWidth;

    private final OnItemClickListener mOnItemClickListener;

//    private final View.OnClickListener mInternalListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Image image = (Image) view.getTag();
//            mOnItemClickListener.onItemClick(view, image);
//        }
//    };

    public SearchAdapter(int imageHeight, int imageWidth, @NonNull OnItemClickListener onItemClickListener) {
        mImages = new ArrayList<>();
        mImageHeight = imageHeight;
        mImageWidth = imageWidth;
        mOnItemClickListener = onItemClickListener;
    }

    public void changeDataSet(@NonNull List<Image> movies) {
        mImages.clear();
        mImages.addAll(movies);
        notifyDataSetChanged();
    }

    @Override
    public SearchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return SearchHolder.create(parent.getContext(), mImageHeight, mImageWidth);
    }

    @Override
    public void onBindViewHolder(SearchHolder holder, int position) {
        Image image = mImages.get(position);
        holder.bind(image);

//        holder.itemView.setOnClickListener(mInternalListener);
        holder.itemView.setTag(image);
    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public interface OnItemClickListener {

        void onItemClick(@NonNull View view, @NonNull Image image);

    }
}
