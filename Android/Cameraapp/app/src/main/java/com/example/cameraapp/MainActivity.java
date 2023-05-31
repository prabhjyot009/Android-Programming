package com.example.cameraapp;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vv1;
    Uri uri1;
    Button bt14,bt15,bt16,bt17,btn18;

    public static int capture_request= 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vv1 = findViewById(R.id.vv1);
        bt14 = findViewById(R.id.b14);
        bt15 = findViewById(R.id.b15);
        bt16 = findViewById(R.id.b16);
        bt17 = findViewById(R.id.b17);
        btn18 = findViewById(R.id.b18);


        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it1=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(it1,capture_request);
            }
        });

        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(it2,capture_request);
            }
        });

        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bt17.setEnabled(false);

                Intent it3=new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
                startActivity(it3);
            }
        });

        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv1.setVideoURI(uri1);
                vv1.start();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == capture_request){

            if(resultCode == RESULT_OK){
                uri1=data.getData();
                bt17.setEnabled(true);
            } else if (resultCode ==RESULT_CANCELED) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            }
        }
    }
}
