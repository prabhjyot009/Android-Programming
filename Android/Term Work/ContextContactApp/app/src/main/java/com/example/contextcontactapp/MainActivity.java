package com.example.contextcontactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {
    ListView t1;
    ConstraintLayout lay;
    String contacts[]={"Option 1","Option 2","Option 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (ListView)findViewById(R.id.t1);
        lay=(ConstraintLayout) findViewById(R.id.lay);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contacts);
        t1.setAdapter(adapter);

        registerForContextMenu(t1);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        menu.setHeaderTitle("Select the Below Options");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId()==R.id.red) {
            lay.setBackgroundColor(Color.RED);
            Toast.makeText(getApplicationContext(),"RED COLOR",Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.green) {
            lay.setBackgroundColor(Color.GREEN);
            Toast.makeText(getApplicationContext(), "GREEN COLOR", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.blue)
        {
            lay.setBackgroundColor(Color.BLUE);
            Toast.makeText(getApplicationContext(),"BLUE COLOR",Toast.LENGTH_LONG).show();
        }else{
            return false;
        }
        return true;
    }
}
