package com.example.twqueseight;
//Write an Android code to show the working of Activity Lifecycle.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: ");
        super.onRestart();
    }
}

// Path: app\src\main\res\layout\activity_main.xml
