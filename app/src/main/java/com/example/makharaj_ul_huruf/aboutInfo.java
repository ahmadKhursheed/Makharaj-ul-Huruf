package com.example.makharaj_ul_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aboutInfo extends AppCompatActivity {


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_info);


        btn=(Button)findViewById(R.id.button9);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/ahmadKhursheed/Makharaj-ul-Huruf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}