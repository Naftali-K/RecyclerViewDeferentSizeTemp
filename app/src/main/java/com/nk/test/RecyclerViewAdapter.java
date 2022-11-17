package com.nk.test;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private static final String TAG = "Text_Code";

    private Context context;
    private List<String> itemList;

    public RecyclerViewAdapter(Context context, List<String> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.bind(position, itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }



    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private ImageView itemImage;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
        }

        void bind(int position, String url) {
            Log.d(TAG, "bind: URL: " + url);
            Picasso.get().load(url).into(itemImage);
        }
    }
}
