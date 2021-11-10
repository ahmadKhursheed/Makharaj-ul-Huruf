package com.example.makharaj_ul_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {


    TextView head;
    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        String BtnName = getIntent().getStringExtra("button");
        img1=findViewById(R.id.imageView2);
        img2=findViewById(R.id.imageView3);
        head=findViewById(R.id.textView);
        head.setText(BtnName.toString());


        if (BtnName.equals("Halqiyah")) {
            img1.setBackgroundResource(R.drawable.halqiyah1);
            img2.setBackgroundResource(R.drawable.halqiyah);
        }
        else if (BtnName.equals("Lahatiyah")) {
            img1.setBackgroundResource(R.drawable.lahatiyah1);
            img2.setBackgroundResource(R.drawable.lahatiyah);
        }
        else if (BtnName.equals("Shajariyah-Haafiyah")) {
            img1.setBackgroundResource(R.drawable.shajar1);
            img2.setBackgroundResource(R.drawable.shajar);
        }
        else if (BtnName.equals("Tarfiyah")) {
            img1.setBackgroundResource(R.drawable.tarfiyah1);
            img2.setBackgroundResource(R.drawable.tarfiyah);
        }
        else if (BtnName.equals("Nit-eeyah")) {
            img1.setBackgroundResource(R.drawable.nit1);
            img2.setBackgroundResource(R.drawable.nit);
        }
        else if (BtnName.equals("Lisaveyah")) {
            img1.setBackgroundResource(R.drawable.lahatiyah1);
            img2.setBackgroundResource(R.drawable.lahatiyah);
        }
        else{
            img1.setBackgroundResource(R.drawable.ghunna2);
            img2.setBackgroundResource(R.drawable.ghunna1);
        }
    }
}