package com.example.uppercaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText e1;
    TextView tv;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         e1=findViewById(R.id.e1);
         tv=findViewById(R.id.tv);
         b1=findViewById(R.id.b1);
         b1.setOnClickListener(this);
            }

            @Override
            public void onClick(View view){
                String name=e1.getText().toString();
                tv.setText(name.toLowerCase());
            }
        }