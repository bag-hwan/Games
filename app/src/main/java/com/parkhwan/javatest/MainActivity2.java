package com.parkhwan.javatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    Button button[] = new Button[13];

    Integer[] Rid_button = {

            R.id.btn_2, R.id.btn_3, R.id.btn_4, R.id.btn_5, R.id.btn_6,
            R.id.btn_7, R.id.btn_8, R.id.btn_9, R.id.btn_10, R.id.btn_11,
            R.id.btn_12, R.id.btn_13
    };

    Integer arr_random_num[] = new Integer[12];

    static void rand(String array[],int a){
        Random rd = new Random();

        for(int i = a-1; i>0; i--){
            int j = rd.nextInt(i+1);
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Random random = new Random();

        for (int i = 0; i < 12; i++) {
            button[i] = (Button) findViewById(Rid_button[i]);
        }

        for(int i=0; i<Rid_button.length; i++){
            arr_random_num[i] = random.nextInt(12) +1;
        }

        String[] ar2 = {};
        String[] ar = {"당첨","당첨","당첨","당첨","당첨","당첨","꽝","당첨","당첨","당첨","당첨","당첨"};
        int b = ar.length;
        rand (ar, b);
        ar2 = ar;

        for(int i = 0; i < Rid_button.length; i++){
            int finalI = i;
            button[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    button[finalI].setText(ar[finalI]);
                }
            });
        }






    }


}