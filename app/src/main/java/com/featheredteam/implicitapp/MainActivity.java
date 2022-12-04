package com.featheredteam.implicitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText nEd, phEd ,webEd,locEd;
    ImageView cImg ,wImg , sImg;
    String name , phone , web , loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nEd = findViewById(R.id.nEd);
        phEd = findViewById(R.id.phEd);
        webEd = findViewById(R.id.webEd);
        locEd = findViewById(R.id.locEd);

        cImg = findViewById(R.id.cImg);
        wImg = findViewById(R.id.wImg);
        sImg = findViewById(R.id.sImg);

        cImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),detailAc.class);
                i.putExtra("name",nEd.getText().toString());
                i.putExtra("phone",phEd.getText().toString());
                i.putExtra("web",webEd.getText().toString());
                i.putExtra("loc",locEd.getText().toString());
                i.putExtra("emo","cry");
                startActivity(i);            }
        });
        wImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),detailAc.class);
                i.putExtra("name",nEd.getText().toString());
                i.putExtra("phone",phEd.getText().toString());
                i.putExtra("web",webEd.getText().toString());
                i.putExtra("loc",locEd.getText().toString());
                i.putExtra("emo","wonder");
                startActivity(i);            }
        });
        sImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),detailAc.class);
                i.putExtra("name",nEd.getText().toString());
                i.putExtra("phone",phEd.getText().toString());
                i.putExtra("web",webEd.getText().toString());
                i.putExtra("loc",locEd.getText().toString());
                i.putExtra("emo","smile");
                startActivity(i);            }
        });
    }
}