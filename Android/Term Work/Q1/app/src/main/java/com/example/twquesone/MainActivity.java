package com.example.twquesone;
//wap to add two numbers and display the result is prime or not prime using button click event and display the result in toast message.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


//import static com.example.twquesone.R.id.btn1;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button btn1;

    TextView tv_result;
    int num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.ed1);
        et2=findViewById(R.id.ed2);
        btn1=findViewById(R.id.btn1);
        tv_result=findViewById(R.id.tv_result);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(et1.getText().toString());
                num2=Integer.parseInt(et2.getText().toString());
                sum=num1+num2;
                Toast.makeText(MainActivity.this, "Sum is "+sum, Toast.LENGTH_SHORT).show();
                //prime number logic starts here
                int flag=0;
                for(int i=2;i<=sum/2;i++)
                {
                    if(sum%i==0)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    Toast.makeText(MainActivity.this, "Sum is prime", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Sum is not prime", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}