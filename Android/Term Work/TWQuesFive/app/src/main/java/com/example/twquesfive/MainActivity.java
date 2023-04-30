package com.example.twquesfive;
//Develop an application that validates the login page and registration page.

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText username, password;
    Button login, register;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(user.equals("admin") && pass.equals("admin"))
                {
                    username.setText("");
                    password.setText("");
                    username.requestFocus();
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(user.equals("admin") && pass.equals("admin"))
                {
                    username.setText("");
                    password.setText("");
                    username.requestFocus();
                }
            }
        });
    }
}