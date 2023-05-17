// Path: app\src\main\java\com\example\arraylist\MainActivity.java
package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> courses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        courses=new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("Android");
        courses.add("Machine Learning");
        tv.setText(courses.toString());
    }
}

//xml file using linear layout
