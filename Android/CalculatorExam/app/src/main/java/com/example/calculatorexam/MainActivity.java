package com.example.calculatorexam;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText e1,e2;
    TextView tv;
    Button b1,b2,b3,b4,b5,b6;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        tv=findViewById(R.id.tv);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        l1=findViewById(R.id.l1);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View src){
        int id;
        id=src.getId();
        if (id==R.id.b1){
            String n1=e1.getText().toString();
            int num1=Integer.parseInt(n1);
            String n2=e2.getText().toString();
            int num2=Integer.parseInt(n2);
            int total=num1+num2;
            tv.setText("Addition is: "+total);
        }
        else if (id==R.id.b2){
            String n1=e1.getText().toString();
            int num1=Integer.parseInt(n1);
            String n2=e2.getText().toString();
            int num2=Integer.parseInt(n2);
            int total=num1-num2;
            tv.setText("Subtraction is: "+total);
        }
        else if (id==R.id.b3){
            String n1=e1.getText().toString();
            int num1=Integer.parseInt(n1);
            String n2=e2.getText().toString();
            int num2=Integer.parseInt(n2);
            int total=num1*num2;
            tv.setText("Multiplication is: "+total);
        }
        else if (id==R.id.b4){
            String n1=e1.getText().toString();
            int num1=Integer.parseInt(n1);
            String n2=e2.getText().toString();
            int num2=Integer.parseInt(n2);
            int total=num1/num2;
            tv.setText("Division is: "+total);

        }
        else if (id==R.id.b5){
            e1.setTextColor(Color.RED);
            e2.setTextColor(Color.RED);
        }
        else if (id==R.id.b6){
            l1.setBackgroundColor(Color.BLACK);
        }
    }
}