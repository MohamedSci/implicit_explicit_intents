package com.featheredteam.implicitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class detailAc extends AppCompatActivity {

    Activity activity;
    TextView snTv;
    ImageView emotImg;
    ImageView phImg;
    ImageView wbImg;
    ImageView locImg;

    Intent intent;

    String em, pho, loc, web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        snTv = findViewById(R.id.snTv);
        emotImg = findViewById(R.id.emotImg);
        phImg = findViewById(R.id.phImg);
        wbImg = findViewById(R.id.wbImg);
        locImg = findViewById(R.id.locImg);
        snTv.setText(intent.getStringExtra("name"));

        em = intent.getStringExtra("emo");
        pho = intent.getStringExtra("phone");
        loc = intent.getStringExtra("loc");
        web = intent.getStringExtra("web");
        
        switch (em) {
            case "cry":
                emotImg.setImageResource(R.drawable.c);
                break;
            case "wonder":
                emotImg.setImageResource(R.drawable.w);
                break;
            case "smile":
                emotImg.setImageResource(R.drawable.s);
                break;
        }


        phImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(Intent.ACTION_DIAL).setData(
                        Uri.parse(pho));
                activity.startActivity(intent);
            }
        });
        wbImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(Intent.ACTION_VIEW).setData(
                        Uri.parse(web));
                activity.startActivity(intent);
            }
        });
        locImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(Intent.ACTION_VIEW).setData(
                        Uri.parse(loc));
                activity.startActivity(intent);
            }
        });


    }
}