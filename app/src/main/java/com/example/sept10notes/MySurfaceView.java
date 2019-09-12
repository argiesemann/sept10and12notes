package com.example.sept10notes;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView {
    MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {//called automatically, like waiting for a click (think OnClick)
        Paint p = new Paint();
        p.setStrokeWidth(5.0f);
        p.setColor(Color.BLUE);

        canvas.drawRect(10,20,20,10,p);
        Bitmap baby = BitmapFactory.decodeResource(getResources(), R.drawable.baby);//gets from resources folder, go to R.drawable folder, find baby
        canvas.drawBitmap(baby, 100, 10, null);
    }
}
