package com.example.androiduiwidgetsform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MyForm extends AppCompatActivity {

    EditText et_name,et_password,et_phone;
    TextView tv_my_form,tv_select;
    CheckBox cb_android,cb_react,cb_kotlin;
    Spinner sp_cities;
    Button button;
    RadioButton rb_male,rb_female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);

        et_name=(EditText) findViewById(R.id.et_name);
        et_password=(EditText) findViewById(R.id.et_password);
        et_phone=(EditText) findViewById(R.id.et_phone);

        tv_my_form=(TextView) findViewById(R.id.tv_my_form);
        tv_select=(TextView) findViewById(R.id.tv_select);

        cb_android=(CheckBox) findViewById(R.id.cb_android);
        cb_react=(CheckBox) findViewById(R.id.cb_react);
        cb_kotlin=(CheckBox) findViewById(R.id.cb_kotlin);

        sp_cities=(Spinner) findViewById(R.id.sp_cities);

        button=(Button) findViewById(R.id.button);

        rb_male=(RadioButton) findViewById(R.id.rb_male);
        rb_female=(RadioButton) findViewById(R.id.rb_female);
    }
    public void getAllValues(View view){
        //get all values from edit text and store in string
        String name=et_name.getText().toString();
        String password=et_password.getText().toString();
        String phone=et_phone.getText().toString();

        //get all values from checkbox and store in string
        String android=cb_android.getText().toString();
        String react=cb_react.getText().toString();
        String kotlin=cb_kotlin.getText().toString();

        //get all values from spinner and store in string
        String city=sp_cities.getSelectedItem().toString();

        //get values from radiobutton and store in string
        String gender="";
        if(rb_male.isChecked()){
            gender=rb_male.getText().toString();
        }
        if(rb_female.isChecked()){
            gender=rb_female.getText().toString();
        }
        //get values from checkbox and store in string
        String interest="";
        if(cb_android.isChecked()){
            interest+=cb_android.getText().toString()+"\n";
        }
        if(cb_react.isChecked()){
            interest+=cb_react.getText().toString()+"\n";
        }
        if(cb_kotlin.isChecked()){
            interest+=cb_kotlin.getText().toString()+"\n";
        }

        //print all values in toast
        String print="name"+"\n"+"password"+"\n"+"phone"+"\n"+"gender"+"\n"+"interest"+"\n"+"city";
        Toast.makeText(this, print, Toast.LENGTH_SHORT).show();

    }
}