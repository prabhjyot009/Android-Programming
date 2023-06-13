package com.example.exampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1;
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.et1);
        b1=(Button) findViewById(R.id.b1);
        tv1=(TextView) findViewById(R.id.tv1);
        b1.setOnClickListener(this);

    }
    public static boolean isStringUpperCase(String str){
        char[] charArray=str.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(!Character.isUpperCase(charArray[i]))
                return false;
            }
            return true;
    }
    @Override
    public void onClick(View view) {
        et1.setTextColor(Color.RED);
        et1.setHintTextColor(Color.RED);

        String s1= et1.getText().toString();
        if(isStringUpperCase(s1)){
            String ss=s1.toLowerCase();
            et1.setTextColor(Color.RED);
            et1.setText(""+ss);
        }
        if(!(isStringUpperCase(s1))){
            String dd=s1.toUpperCase();
            et1.setTextColor(Color.RED);
            et1.setText(""+dd);
        }
    }
}