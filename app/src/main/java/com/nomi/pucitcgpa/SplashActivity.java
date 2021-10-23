package com.nomi.pucitcgpa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Fade;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    private int SPLASH_TIME = 3000;//which is equal to 1.5 sec
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        final ImageView imageView = findViewById(R.id.image_activity_1);

        setTitle("main activity");
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);



//        LinearLayout linearLayout = findViewById(R.id.layout);
//        AnimationDrawable animationDrawable =(AnimationDrawable) linearLayout.getBackground();
//        animationDrawable.setEnterFadeDuration(2000);
//        animationDrawable.setExitFadeDuration(4000);
//        animationDrawable.start();

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               // Intent mySuperIntent = new Intent(SplashActivity.this, LoginActivity.class);
              //  ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, imageView, ViewCompat.getTransitionName(imageView));
              //  startActivity(mySuperIntent, options.toBundle());
                finish();
            }
        }, SPLASH_TIME);
    }

}