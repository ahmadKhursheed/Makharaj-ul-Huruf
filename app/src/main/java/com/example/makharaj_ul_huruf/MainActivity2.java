package com.example.makharaj_ul_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button7);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button2);




        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Halqiyah");
                startActivity(newintent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Lahatiyah");
                startActivity(newintent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Shajariyah-Haafiyah");
                startActivity(newintent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Tarfiyah");
                startActivity(newintent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Nit-eeyah");
                startActivity(newintent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Lisaveyah");
                startActivity(newintent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity2.this,MainActivity4.class);
                newintent.putExtra("button", "Ghunna");
                startActivity(newintent);
            }
        });
    }
}