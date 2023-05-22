package com.example.menubardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuBar extends AppCompatActivity {
    ListView contactslist;
    String[] contacts={"Deepak","Sameer","Prabhjyot","Khalid"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_bar);
        contactslist=(ListView) findViewById(R.id.contactslist);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        contactslist.setAdapter(adapter);
        registerForContextMenu(contactslist);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menubar,menu);
    }

        @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.call){
            Toast.makeText(this, "Calling", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id==R.id.message){
            Toast.makeText(this, "Messaging", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            return super.onContextItemSelected(item);
        }
    }
}