package com.example.twquesfive;
//Develop an application that validates the login page and registration page using the following conditions:
//1. Username should be a valid email address.
//2. Password should be a minimum of 8 characters.
//3. Password should contain at least one uppercase letter, one lowercase letter, one number and one special character.
//4. The user should be able to register and login successfully.

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button login, register;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        register = findViewById(R.id.btnRegister);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().isEmpty()) {
                    email.setError("Please enter email");
                } else if (!Pattern.matches(emailPattern, email.getText().toString())) {
                    email.setError("Please enter valid email");
                } else if (password.getText().toString().isEmpty()) {
                    password.setError("Please enter password");
                } else if (!Pattern.matches(passwordPattern, password.getText().toString())) {
                    password.setError("Please enter valid password");
                } else {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().isEmpty()) {
                    email.setError("Please enter email");
                } else if (!Pattern.matches(emailPattern, email.getText().toString())) {
                    email.setError("Please enter valid email");
                } else if (password.getText().toString().isEmpty()) {
                    password.setError("Please enter password");
                } else if (!Pattern.matches(passwordPattern, password.getText().toString())) {
                    password.setError("Please enter valid password");
                } else {
                    Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

// Path: app\src\main\res\layout\activity_main.xml using LinearLayout
