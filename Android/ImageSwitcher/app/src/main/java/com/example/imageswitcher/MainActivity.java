package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher imageSwitcher;
    Button nxtbtn,prevbtn;

    int[] imagearr={R.drawable.one,R.drawable.two,R.drawable.three};
    int img_index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //now we will add layouts findviewbyid:

        imageSwitcher =(ImageSwitcher) findViewById(R.id.imageswitcher);
        nxtbtn=(Button) findViewById(R.id.nxtbtn);
        prevbtn=(Button) findViewById(R.id.prevbtn);

        //array to add images:
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                return imageView;
            }
        });
        imageSwitcher.setImageResource(imagearr[0]);
    }

    public void Nxtbtn(View view){
        img_index=img_index+1;
        if(img_index==imagearr.length){
            img_index=0;
        }
        imageSwitcher.setImageResource(imagearr[img_index]);
    }
    public void Prevbtn(View view){
        img_index=img_index-1;
        if(img_index==-1){
            img_index=imagearr.length-1;
        }
        imageSwitcher.setImageResource(imagearr[img_index]);
    }
}