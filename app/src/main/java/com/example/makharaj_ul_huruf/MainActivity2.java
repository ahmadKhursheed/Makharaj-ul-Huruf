package com.example.makharaj_ul_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {


    Button button1,button2,button3,button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button7);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button2);




        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Halqiyah");
                startActivity(newintent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Lahatiyah");
                startActivity(newintent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Shajariyah-Haafiyah");
                startActivity(newintent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Tarfiyah");
                startActivity(newintent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Nit-eeyah");
                startActivity(newintent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Lisaveyah");
                startActivity(newintent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Ghunna");
                startActivity(newintent);
            }
        });
    }
}