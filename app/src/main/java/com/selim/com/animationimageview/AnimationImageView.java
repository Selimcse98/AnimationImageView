package com.selim.com.animationimageview;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AnimationImageView extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_image_view);

        final ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setBackgroundResource(R.drawable.animation);
        AnimationDrawable animationDrawable = (AnimationDrawable) image.getBackground();
        animationDrawable.start();
    }
}
