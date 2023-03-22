package com.example.displayname;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.os.Bundle;
import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText name;
    Button btn;
    TextView result;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        btn=findViewById(R.id.btn);
        result=findViewById(R.id.result);
        print_name(name,btn,result);
    }
    public static void print_name(EditText name,Button btn,TextView result)
    {
        btn.setOnClickListener(v -> {

            String s1=name.getText().toString();
            result.setText(s1);
        });
    }
}

