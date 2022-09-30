package com.parkhwan.javatest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton btn_Home = (ImageButton) findViewById(R.id.btn_select);
        final ImageButton btn_Home2 = (ImageButton) findViewById(R.id.btn_bumb);

        btn_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent1);

            }
        });

       btn_Home2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent2 = new Intent(MainActivity.this,MainActivity3.class);
               startActivity(intent2);
           }
       });
    }

}