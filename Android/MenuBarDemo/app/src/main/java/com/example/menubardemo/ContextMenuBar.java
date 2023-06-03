package com.example.menubardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class ContextMenuBar extends AppCompatActivity {
    ListView contactslist;
    String[] contacts={"Prabhjyot","Khalid","Ayush"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_bar);
        contactslist=findViewById(R.id.contactslist);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,contacts);
        contactslist.setAdapter(adapter);
        contactslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data=(String)parent.getItemAtPosition(position);
                Toast.makeText(ContextMenuBar.this,data, Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                        Intent intent=new Intent(ContextMenuBar.this,MainActivity1.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(ContextMenuBar.this,MainActivity2.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(ContextMenuBar.this,MainActivity3.class);
                        startActivity(intent2);
                        break;
                }
            }
        });
    }
}

//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        getMenuInflater().inflate(R.menu.context_menubar,menu);
//    }
/*      /*  @Override
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
    }*/