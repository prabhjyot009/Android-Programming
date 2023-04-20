package com.example.explicitacticity1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        EditText et_name=findViewById(R.id.et_name);
        EditText et_email=findViewById(R.id.et_email);
        EditText et_phone=findViewById(R.id.et_phone);

        Button btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=et_name.getText().toString();
                String email=et_email.getText().toString();
                String phone=et_phone.getText().toString();

                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("Name: ",name);
                intent.putExtra("Email: ",email);
                intent.putExtra("Phone no.: ",phone);
                startActivity(intent);
            }
        });
    }
}