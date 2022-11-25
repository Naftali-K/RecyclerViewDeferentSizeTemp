package com.nk.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private ImageView image;
    private TextView title;
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
        title = findViewById(R.id.title);
        recyclerView = findViewById(R.id.recycler_view);
    }

    private void makeList(){
//        pictureList.add("https://flxt.tmsimg.com/assets/33623_v9_bd.jpg");
//        pictureList.add("https://image.bikebros.co.jp/bike_img/1/15944/1_l.jpg");
//        pictureList.add("https://wieck-nissanao-production.s3.amazonaws.com/photos/ca2931d27e08afe1fb0398e6c3926e071cd8f041/preview-928x522.jpg");
//        pictureList.add("https://m.media-amazon.com/images/I/61JgMQGNViL.jpg");
//        pictureList.add("https://cdn.shopify.com/s/files/1/0488/5331/9840/collections/Mega_Menu_280x480_traditional.png");
//        pictureList.add("https://cdn.shopify.com/s/files/1/0488/5331/9840/products/limitlessrth_compoundbow-adult__av91a21075r_01.png");
//        pictureList.add("https://m.media-amazon.com/images/I/61Ckk6bdzwL.jpg");

        //Design
        pictureList.add("https://images.unsplash.com/photo-1647891941746-fe1d53ddc7a6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDF8MHxzZWFyY2h8MXx8ZmFzaGlvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1515886657613-9f3515b0c78f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZmFzaGlvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1483985988355-763728e1935b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8ZmFzaGlvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1492707892479-7bc8d5a4ee93?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8ZmFzaGlvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1539109136881-3be0616acf4b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8ZmFzaGlvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://plus.unsplash.com/premium_photo-1661274030066-09e7378fc470?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8ZmFzaGlvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1496747611176-843222e1e57c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGZhc2hpb258ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1581044777550-4cfa60707c03?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8ZmFzaGlvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1627483297929-37f416fec7cd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDF8MHxzZWFyY2h8OHx8ZmFzaGlvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1490481651871-ab68de25d43d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGZhc2hpb258ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1509631179647-0177331693ae?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGZhc2hpb258ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1469334031218-e382a71b716b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGZhc2hpb258ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1487222477894-8943e31ef7b2?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjh8fGZhc2hpb258ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60");
        pictureList.add("https://images.unsplash.com/photo-1550614000-4895a10e1bfd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjd8fGZhc2hpb258ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60");

    }
}