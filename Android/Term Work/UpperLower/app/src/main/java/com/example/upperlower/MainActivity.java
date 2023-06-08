package com.example.upperlower;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        b1.setOnClickListener(this);
    }
    private static boolean isStringUpperCase(String str){
        char[] charArray = str.toCharArray();
        for(int i=0; i < charArray.length; i++){
            //if any character is not in upper case, return false
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }
        return true;
    }
    @Override
    public void onClick(View view)
    {
        e1.setTextColor(Color.RED);
        e1.setHintTextColor(Color.RED);
        String s1=e1.getText().toString();
        if(isStringUpperCase(s1))
        {
            String ss=s1.toLowerCase();
            e1.setTextColor(Color.RED);
            e1.setText(""+ss);
        }
        if(! (isStringUpperCase(s1)))
        {
            String dd=s1.toUpperCase();
            e1.setTextColor(Color.RED);
            e1.setText(""+dd);
        }
    }
}