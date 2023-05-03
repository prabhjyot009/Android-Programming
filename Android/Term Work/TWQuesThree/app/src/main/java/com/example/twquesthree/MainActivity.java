package com.example.twquesthree;
//4.	Create an application which displays three buttons named Red, Yellow, and Green. The background color of activity should be changed to appropriate color when user clock on any of these buttons using radio button.

// Path: app\src\main\java\com\example\twquesthree\MainActivity.java


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton red, yellow, green;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.red);
        yellow = findViewById(R.id.yellow);
        green = findViewById(R.id.green);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (red.isChecked()) {
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                } else if (yellow.isChecked()) {
                    getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                } else if (green.isChecked()) {
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                }
            }
        });
    }
}