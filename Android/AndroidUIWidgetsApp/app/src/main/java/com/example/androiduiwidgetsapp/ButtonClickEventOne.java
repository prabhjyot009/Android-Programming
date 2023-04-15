package com.example.androiduiwidgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonClickEventOne extends AppCompatActivity {

    EditText et_name;
    Button btn_one;
    TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_event_one);

        et_name=(EditText) findViewById(R.id.et_name);
        btn_one=(Button) findViewById(R.id.btn_one);
        tv_name=(TextView) findViewById(R.id.tv_name);

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=et_name.getText().toString();
                tv_name.setText("Name:"+name);
            }
        });
    }
}