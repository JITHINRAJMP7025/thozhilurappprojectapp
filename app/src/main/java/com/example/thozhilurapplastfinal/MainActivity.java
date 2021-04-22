package com.example.thozhilurapplastfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;
    Animation topanim, bottomanim;
    ImageView thozhilpic, logo;
    TextView appname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        topanim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomanim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        thozhilpic = findViewById(R.id.imageView);
        logo = findViewById(R.id.imageView2);
        appname = findViewById(R.id.textView);
        thozhilpic.setAnimation(topanim);
        logo.setAnimation(bottomanim);
        Thread timer = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent next=new Intent(getApplicationContext(),userlogin.class);
                    startActivity(next);
                    finish();
                    super.run();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        };
        timer.start();

    }
}