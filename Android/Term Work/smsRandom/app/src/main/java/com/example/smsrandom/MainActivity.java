package com.example.smsrandom;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText Evph;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Evph=findViewById(R.id.Evph);
        send=findViewById(R.id.send);
        Random random=new Random();
        int min = 10000;
        int max = 99999;
        int randomNumber = random.nextInt(max - min + 1) + min;
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no=Evph.getText().toString();
                SmsManager sms= SmsManager.getDefault();
                sms.sendTextMessage(no, null, ""+randomNumber, null,null);
            }});}}