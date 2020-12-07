package com.example.covid_19ai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Launching extends AppCompatActivity {
    Timer time;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_launching);
        RunAnimation();

        time=new Timer();
        if(time!=null){
            time.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent=new Intent(Launching.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            }, 5000);
        }
    }
    private void  RunAnimation(){
        Animation a = AnimationUtils.loadAnimation(this, R.anim.scale);
        a.reset();
        image=findViewById(R.id.imageView3);
        image.clearAnimation();
        image.startAnimation(a);
    }
}