package com.nk.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private RecyclerView recyclerView;

    private List<String> pictureList = new ArrayList<>();

    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setReferences();
        makeList();

//        Picasso.get().load("https://image.bikebros.co.jp/bike_img/1/15944/1_l.jpg").into(image);

        recyclerViewAdapter = new RecyclerViewAdapter(getBaseContext(), pictureList);
        recyclerView.setAdapter(recyclerViewAdapter);

    }

    private void setReferences(){
//        image = findViewById(R.id.image);
        recyclerView = findViewById(R.id.recycler_view);
    }

    private void makeList(){
        pictureList.add("https://flxt.tmsimg.com/assets/33623_v9_bd.jpg");
        pictureList.add("https://image.bikebros.co.jp/bike_img/1/15944/1_l.jpg");
        pictureList.add("https://wieck-nissanao-production.s3.amazonaws.com/photos/ca2931d27e08afe1fb0398e6c3926e071cd8f041/preview-928x522.jpg");
        pictureList.add("https://m.media-amazon.com/images/I/61JgMQGNViL.jpg");
        pictureList.add("https://cdn.shopify.com/s/files/1/0488/5331/9840/collections/Mega_Menu_280x480_traditional.png");
        pictureList.add("https://cdn.shopify.com/s/files/1/0488/5331/9840/products/limitlessrth_compoundbow-adult__av91a21075r_01.png");
        pictureList.add("https://m.media-amazon.com/images/I/61Ckk6bdzwL.jpg");

    }
}