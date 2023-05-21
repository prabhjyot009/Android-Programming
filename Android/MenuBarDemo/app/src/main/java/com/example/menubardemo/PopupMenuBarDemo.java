package com.example.menubardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuBarDemo extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu_bar_demo);
        btn1=(Button) findViewById(R.id.btn1);
    }

    public void openPopupMenuBar(View view){
        PopupMenu popupMenu=new PopupMenu(PopupMenuBarDemo.this,btn1);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menus,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                int id=menuItem.getItemId();
                if(id==R.id.menu_1){
                    Toast.makeText(PopupMenuBarDemo.this, "Menu 1 Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                if(id==R.id.menu_2){
                    Toast.makeText(PopupMenuBarDemo.this, "Menu 2 Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                if(id==R.id.menu_3){
                    Toast.makeText(PopupMenuBarDemo.this, "Menu 3 Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else {
                    Toast.makeText(PopupMenuBarDemo.this, "Nothing", Toast.LENGTH_SHORT).show();
                    return true;
                }
            }
        });
        popupMenu.show();
    }
}