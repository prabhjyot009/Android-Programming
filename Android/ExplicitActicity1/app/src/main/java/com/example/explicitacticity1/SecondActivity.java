package com.example.explicitacticity1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String name= intent.getStringExtra("Name");
        String email=intent.getStringExtra("Email");
        String phone=intent.getStringExtra("Phone");

        TextView tv_result=findViewById(R.id.tv_result);
        Button btn2=findViewById(R.id.btn2);

        tv_result.setText("Name: "+name+ "\nEmail: "+email+ "\nPhone: "+phone);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(intent1);
            }
        });
    }
}