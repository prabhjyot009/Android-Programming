package com.example.androiduiwidgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonClickEventTwo extends AppCompatActivity {

    EditText et_email;
    Button btn_two;
    TextView tv_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_event_two);

        et_email = (EditText) findViewById(R.id.et_email);
        btn_two = (Button) findViewById(R.id.btn_two);
        tv_email = (TextView) findViewById(R.id.tv_email);
    }
        public void getUserEmail(View view)
        {
            String email= et_email.getText().toString();
            tv_email.setText("Email:"+email);
        }
}