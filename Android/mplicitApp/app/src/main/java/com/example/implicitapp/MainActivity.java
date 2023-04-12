package com.example.implicitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:
                Intent i1 = new Intent(MainActivity.this, in1.class);
                startActivity(i1);
                break;
            case R.id.b2:
                Intent i2 = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i2);
                break;
        }
    }
}
//code this by onclick attribute in java file
//public class MainActivity extends AppCompatActivity {
//    Button b1,b2;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        b1=findViewById(R.id.b1);
//        b2=findViewById(R.id.b2);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i1=new Intent(MainActivity.this,in1.class);
//                startActivity(i1);
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i2=new Intent(MainActivity.this,MainActivity.class);
//                startActivity(i2);
//            }
//        });
//    }
//}
