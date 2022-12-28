package com.example.spaceshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Context context;
    Bitmap explosion[] = new Bitmap[9];
    int explosionFrame;
    int ex,ey;

    public Explosion(Context context, int ex, int ey){
        this.context = context;
        explosion[0] = getExplosionBitmap(R.drawable.explosion0);
        explosion[1] = getExplosionBitmap(R.drawable.explosion1);
        explosion[2] = getExplosionBitmap(R.drawable.explosion2);
        explosion[3] = getExplosionBitmap(R.drawable.explosion3);
        explosion[4] = getExplosionBitmap(R.drawable.explosion4);
        explosion[5] = getExplosionBitmap(R.drawable.explosion5);
        explosion[6] = getExplosionBitmap(R.drawable.explosion6);
        explosion[7] = getExplosionBitmap(R.drawable.explosion7);
        explosion[8] = getExplosionBitmap(R.drawable.explosion8);
        explosionFrame = 0;
        this.ex = ex;
        this.ey = ey;
    }

    public Bitmap getExplosion(int explosionFrame){
        return explosion[explosionFrame];
    }

    Bitmap getExplosionBitmap(int resource){
        return BitmapFactory.decodeResource(context.getResources(),resource);
    }
}
