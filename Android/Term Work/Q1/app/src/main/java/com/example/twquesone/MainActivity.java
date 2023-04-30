package com.example.twquesone;
//Create an Android app to add two numbers and check the output is prime or not.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText et1,et2;
    TextView tv1;
    int num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
    }
    public void add(View view)
    {
        num1=Integer.parseInt(et1.getText().toString());
        num2=Integer.parseInt(et2.getText().toString());
        sum=num1+num2;
        tv1.setText("Sum is "+sum);
    }
    public void prime(View view)
    {
        int flag=0;
        for(int i=2;i<=sum/2;i++)
        {
            if(sum%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            tv1.setText("Sum is prime");
        }
        else
        {
            tv1.setText("Sum is not prime");
        }
    }
}