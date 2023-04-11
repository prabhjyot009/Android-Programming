package com.example.practiceques2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button button;
    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        button=findViewById(R.id.button);
        num=findViewById(R.id.num);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //print multiplication table of num
                int n=Integer.parseInt(num.getText().toString());
                String s="";
                for(int i=1;i<=10;i++){
                    s=s+n+"*"+i+"="+n*i+" "+"\n";
            };
                text.setText(s);
            }
        });
    }
}