package com.example.tapgame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class CharacterSprite {
    private Bitmap image;
    private int x, y;
    private int xVelocity, yVelocity;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    public CharacterSprite(Bitmap bmp) {
        image = bmp;
        x = 80;
        y = 200;
        xVelocity = 1;
        yVelocity = 1;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

    public void update() {
        x += xVelocity;
        y += yVelocity;
        if ((x >= screenWidth - image.getWidth())|| (x <= 0) ) {
            xVelocity *= -1;
        }
        if ((y >= screenHeight - image.getHeight()) || (y <= 0)) {
            yVelocity *= -1;
        }
    }
}
