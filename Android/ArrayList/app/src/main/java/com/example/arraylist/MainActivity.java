// Path: app\src\main\java\com\example\arraylist\MainActivity.java
package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    ArrayList<String> courses=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        btn=findViewById(R.id.btn);

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("Android");
        courses.add("Machine Learning");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(String course:courses){
                    tv.append(course+"\n");
                }
            }
        });

    }
}