package com.example.makharaj_ul_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {


    TextView heading;
    ImageView image1,image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        String BtnName = getIntent().getStringExtra("button");
        image1=findViewById(R.id.imageView2);
        image2=findViewById(R.id.imageView3);
        heading=findViewById(R.id.textView);
        heading.setText(BtnName.toString());


        if (BtnName.equals("Halqiyah")) {
            image1.setBackgroundResource(R.drawable.halqiyah1);
            image2.setBackgroundResource(R.drawable.halqiyah);
        }
        else if (BtnName.equals("Lahatiyah")) {
            image1.setBackgroundResource(R.drawable.lahatiyah1);
            image2.setBackgroundResource(R.drawable.lahatiyah);
        }
        else if (BtnName.equals("Shajariyah-Haafiyah")) {
            image1.setBackgroundResource(R.drawable.shajar1);
            image2.setBackgroundResource(R.drawable.shajar);
        }
        else if (BtnName.equals("Tarfiyah")) {
            image1.setBackgroundResource(R.drawable.tarfiyah1);
            image2.setBackgroundResource(R.drawable.tarfiyah);
        }
        else if (BtnName.equals("Nit-eeyah")) {
            image1.setBackgroundResource(R.drawable.nit1);
            image2.setBackgroundResource(R.drawable.nit);
        }
        else if (BtnName.equals("Lisaveyah")) {
            image1.setBackgroundResource(R.drawable.lahatiyah1);
            image2.setBackgroundResource(R.drawable.lahatiyah);
        }
        else{
            image1.setBackgroundResource(R.drawable.ghunna2);
            image2.setBackgroundResource(R.drawable.ghunna1);
        }
    }
}