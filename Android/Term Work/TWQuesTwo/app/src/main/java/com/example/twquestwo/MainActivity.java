package com.example.twquestwo;
//2.	Design an app in which you have to display your name in the middle of the screen with red color and each time when you click on a button, name will increase with font size and after increasing 5 times, means at sixth time, it will not increase and display a message “you can’t perform this operation”.

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        button = findViewById(R.id.button);
        textView.setTextColor(Color.RED);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count<=5){
                    textView.setTextSize(20*count);
                }
                else{
                    textView.setText("You can't perform this operation");
                }
            }
        });
    }
}