package com.example.twquesfour;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new MyView(this));
    }

    public class MyView extends View{

        public MyView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Paint paint = new Paint();
            Path path = new Path();

            //circle
            int x = getWidth();
            int y = getHeight();
            int redius = 200;

            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.GREEN);

            canvas.drawPaint(paint);

            paint.setColor(Color.parseColor("#CD5C5C"));

            canvas.drawCircle(x/2, y/2, redius, paint);

            //Rectangle
            paint.setColor(Color.parseColor("#FF0000"));

            canvas.drawRect(100, 50, 300, 300, paint);

            //Triangle
            Point a = new Point(350, 50);
            Point b = new Point(350, 300);
            Point c = new Point(650, 50);

            path.setFillType(Path.FillType.EVEN_ODD);

            path.lineTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(a.x, a.y);
            path.close();

            canvas.drawPath(path, paint);
        }
    }
}