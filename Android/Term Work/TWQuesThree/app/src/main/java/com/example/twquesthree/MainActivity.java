package com.example.twquesthree;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton red, yellow, green;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red = findViewById(R.id.red);
        yellow = findViewById(R.id.yellow);
        green = findViewById(R.id.green);
    }
    public void Red(View view) {
        getWindow().getDecorView().setBackgroundColor(Color.RED);
    }
    public void Yellow(View view) {
        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
    }
    public void green(View view) {
        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
    }
}