package com.example.explicitacticity1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    //EditText:
    EditText et_name;
    EditText et_email;
    EditText et_phone;

    //Button:
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

         et_name=(EditText) findViewById(R.id.et_name);
         et_email=(EditText) findViewById(R.id.et_email);
         et_phone=(EditText) findViewById(R.id.et_phone);

         btn=(Button) findViewById(R.id.btn);

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