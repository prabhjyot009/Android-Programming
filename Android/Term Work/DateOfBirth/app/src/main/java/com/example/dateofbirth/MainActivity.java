package com.example.dateofbirth;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = Calendar.getInstance().get(Calendar.YEAR);
                int month = Calendar.getInstance().get(Calendar.MONTH);
                int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

                int y = Integer.parseInt(et1.getText().toString());
                int m = Integer.parseInt(et2.getText().toString());
                int d = Integer.parseInt(et3.getText().toString());

                int age = year - y;

                if(month < m){
                    age--;
                }
                else if(month == m && day < d){
                    age--;
                }

                Toast.makeText(MainActivity.this, "Your age is "+age, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

