package com.example.spaceshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class OurSpaceship {
    Context context;
    Bitmap[] ourSpaceship = new Bitmap[10];
    int shipFrame = 0;
    int ox,oy;
    boolean isAlive = true;
    int ourVelocity;
    Random random;


    public OurSpaceship(Context context){
        this.context = context;
        ourSpaceship[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket1);
        ourSpaceship[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket2);
        ourSpaceship[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket3);
        ourSpaceship[3] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket4);
        ourSpaceship[4] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket5);
        ourSpaceship[5] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket6);
        ourSpaceship[6] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket7);
        ourSpaceship[7] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket8);
        ourSpaceship[8] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket9);
        ourSpaceship[9] = BitmapFactory.decodeResource(context.getResources(),R.drawable.our_rocket10);
        shipFrame = 0;
        random = new Random();
        resetOurSpaceship();
    }

    Bitmap getExplosionBitmap(int resource){
        return BitmapFactory.decodeResource(context.getResources(),resource);
    }


    public Bitmap getOurSpaceship(){
        return ourSpaceship[shipFrame];
    }

    int getOurSpaceshipWidth(){
        return ourSpaceship[shipFrame].getWidth();
    }

    int getOurSpaceshipHeight(){
        return ourSpaceship[shipFrame].getHeight();
    }

    private void resetOurSpaceship() {
        ox = random.nextInt(SpaceShooter.screenWidth);
        oy = SpaceShooter.screenHeight - ourSpaceship[shipFrame].getHeight();
        ourVelocity = 10 + random.nextInt(6);
    }
}
