package com.example.androidlifecyclelogcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class AndroidLifecycleLogcat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_lifecycle_logcat);
        //WRITE A CODE TO SHOW ANDROID LIFE CYCLE METHODS IN LOGCAT WINDOW.

        Log.d("AndroidLifecycleLogcat","onCreate");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("AndroidLifecycleLogcat","onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("AndroidLifecycleLogcat","onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("AndroidLifecycleLogcat","onPause");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("AndroidLifecycleLogcat","onStop");

    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("AndroidLifecycleLogcat","onDestroy");
    }

}