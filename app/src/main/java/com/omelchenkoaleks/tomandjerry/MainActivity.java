package com.omelchenkoaleks.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageSwitcher mImageSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageSwitcher = findViewById(R.id.image_switcher);
        Animation inAnimation = new AlphaAnimation(0, 1);
        inAnimation.setDuration(3000);
        Animation outAnimation = new AlphaAnimation(1, 0);
        outAnimation.setDuration(3000);

        mImageSwitcher.setInAnimation(inAnimation);
        mImageSwitcher.setOutAnimation(outAnimation);
    }

    public void onSwitcherClick(View view) {
        mImageSwitcher.showNext();
    }

//    public void eraseTom(View view) {
//        ImageView tomImageView = findViewById(R.id.tom_image_view);
//        ImageView jerryImageView = findViewById(R.id.jerry_image_view);
//
//        tomImageView.animate().alpha(0).setDuration(3000);
//        jerryImageView.animate().alpha(1).setDuration(3000);
//    }

}
