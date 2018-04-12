package com.example.otmane.color;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Color extends AppCompatActivity {

    Button btn1 , btn2, btn3 , btn4 ,btn5 , btn6 ;
    int color;
    Drawable dr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = 1;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = 2;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = 3;
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (color){
                    case 1 : btn4.setBackgroundColor(android.graphics.Color.RED);
                    break;
                    case 2 : btn4.setBackgroundColor(android.graphics.Color.GREEN);
                        break;
                    case 3 : btn4.setBackgroundColor(android.graphics.Color.BLUE);
                        break;
                    default: color = 0;
                        break;

                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (color){
                    case 1 : btn5.setBackgroundColor(android.graphics.Color.RED);
                        break;
                    case 2 : btn5.setBackgroundColor(android.graphics.Color.GREEN);
                        break;
                    case 3 : btn5.setBackgroundColor(android.graphics.Color.BLUE);
                        break;
                     default: color = 0;
                        break;
                }            }
        });
    }
}
