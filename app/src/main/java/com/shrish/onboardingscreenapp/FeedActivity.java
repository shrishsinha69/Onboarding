package com.shrish.onboardingscreenapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    imagesAdapter adapter;
    ArrayList<onlineImages>imagesArrayList;
    Button button7;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
//        button7 = findViewById(R.id.btnFirst);
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openMainActivity();
//            }
//
//            private void openMainActivity() {
//                Intent i = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(i);
//
//            }
//        });

        recyclerView=findViewById(R.id.recyclerview);
        imagesArrayList=new ArrayList<>();
        String imageurl1 = "https://www.pexels.com/photo/beautiful-view-of-moraine-lake-2662116/";
        String imageurl2 = "https://beebom.com/legal-and-free-music-download-websites/";
//        String imageurl3 = "";
//        String imageurl4 = "";
//        String imageurl5= "";
//        String imageurl6 = "";
//        String imageurl7= "";
//        String imageurl8 = "";
//        String imageurl9 = "";
//        String imageurl10 = "";


        imagesArrayList.add(new onlineImages(imageurl1, "bshdsbddfsbsf "));
        imagesArrayList.add(new onlineImages(imageurl2, " vx xxx"));
//        imagesArrayList.add(new onlineImages(imageurl3, ""));
//        imagesArrayList.add(new onlineImages(imageurl4, ""));
//        imagesArrayList.add(new onlineImages(imageurl5, ""));
//        imagesArrayList.add(new onlineImages(imageurl6, ""));
//        imagesArrayList.add(new onlineImages(imageurl7, ""));
//        imagesArrayList.add(new onlineImages(imageurl8, ""));
//        imagesArrayList.add(new onlineImages(imageurl9, ""));
//        imagesArrayList.add(new onlineImages(imageurl10, ""));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new imagesAdapter(FeedActivity.this,imagesArrayList);
        recyclerView.setAdapter(adapter);

    }
}