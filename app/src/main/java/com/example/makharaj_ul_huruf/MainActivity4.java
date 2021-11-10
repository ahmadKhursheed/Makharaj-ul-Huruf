package com.example.makharaj_ul_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {


    public TextView head;
    public ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        String BtnName = getIntent().getStringExtra("button");
        img1=findViewById(R.id.imageView);
        head=findViewById(R.id.textView);
        head.setText(BtnName.toString());


//        if (BtnName.equals("Halqiyah")) {
//            img1.setBackgroundResource(R.drawable.halqiyah);
//
//        }
    }
}