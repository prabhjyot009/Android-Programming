package com.example.twquesfour;

//Write an application that draws graphical primitives such as circle, rectangle and square. Fill all these primitives with different colors.

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyView myView;
    Paint paint;
    RectF rectF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = new MyView(this);
        setContentView(myView);
        paint = new Paint();
        rectF = new RectF(100, 100, 200, 200);
    }

    public void drawCircle(View view) {
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        myView.invalidate();
    }

    public void drawRectangle(View view) {
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        myView.invalidate();
    }

    public void drawSquare(View view) {
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        myView.invalidate();
    }

    class MyView extends View {

        public MyView(MainActivity mainActivity) {
            super(mainActivity);
        }

        @Override
        protected void onDraw(android.graphics.Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawCircle(200, 200, 100, paint);
            canvas.drawRect(rectF, paint);
            canvas.drawRect(300, 300, 400, 400, paint);
        }
    }
}


