package com.example.androiduiwidgetsform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleBtnSwitchDemo extends AppCompatActivity {

    ToggleButton wifi_toggle_btn;
    Switch wifi_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_btn_switch_demo);

        wifi_toggle_btn=(ToggleButton) findViewById(R.id.wifi_toggle_btn);
    }
    public void getValueFromToggleBtn(View view){
        if(wifi_toggle_btn.isChecked()){
            Toast.makeText(this, "Wifi ON", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Wifi Off", Toast.LENGTH_SHORT).show();
        }

    }
    public  void getValueFromSwitch(View view){
        if (wifi_switch.isChecked()){
            Toast.makeText(this, "Wifi On", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Wifi Off", Toast.LENGTH_SHORT).show();
        }
    }
}