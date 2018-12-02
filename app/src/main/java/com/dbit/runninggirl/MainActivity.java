package com.dbit.runninggirl;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageAnim = (ImageView) findViewById(R.id.girl);
        ImageView imageBG = (ImageView) findViewById(R.id.girl_bg);
        imageAnim.setBackgroundResource(R.drawable.running_animation);
        imageBG.setBackgroundResource(R.drawable.background_anim);

        AnimationDrawable girlAnimation = (AnimationDrawable) imageAnim.getBackground();
        AnimationDrawable bgAnimation = (AnimationDrawable) imageBG.getBackground();
        girlAnimation.start();
        bgAnimation.start();


    }
}
