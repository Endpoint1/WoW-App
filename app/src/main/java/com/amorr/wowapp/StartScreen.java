package com.amorr.wowapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by amorr on 8/23/2017.
 */

public class StartScreen extends View
{
    WoWApp mainclass;
    float scalex;
    float scaley;

    public StartScreen(Context c)
    {
        super(c);
        mainclass = (WoWApp)c;
    }

    protected void onDraw(Canvas g)
    {
        scalex = (float) (g.getWidth() / 180);
        scaley = (float) (g.getHeight() / 200);
        g.scale(scalex, scaley);

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        android:setBackgroundColor(Color.BLACK);

        paint.setColor(Color.BLUE);
        g.drawText("Welcome", 65, 80, paint);
        g.drawText("to", 86, 100, paint);
        g.drawText("WoW Creator", 55, 120, paint);


    }

}