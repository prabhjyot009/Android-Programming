package com.example.optionmenubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menubar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();
        if (item_id == R.id.option_menu_1) {
            Toast.makeText(this, "Option1 is clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item_id== R.id.option_menu_2){
            Toast.makeText(this, "Option2 is clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item_id== R.id.option_menu_3){
            Toast.makeText(this, "Option3 is clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }
}