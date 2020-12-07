package com.example.covid_19ai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class SecnodpageActivity extends AppCompatActivity {
    //private static final String TAG="SecnodpageActivity";

    private TextView welcome;
    private String nam;
    Timer time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secnodpage);
       /* Bundle intentextras=getIntent().getExtras();


            //Toast.makeText(this, "You need not to agree to name", Toast.LENGTH_SHORT).show();
            nam = intentextras.getString("passdata1");//Key name should be same
            if(nam==null){
                Toast.makeText(this, "The name has not stored", Toast.LENGTH_SHORT).show();
            }
            else{
            welcome = findViewById(R.id.textViewelcome);
            welcome.setText("Hello " + nam);
        }*/
        RunAnimation();
        GoForNextActivity();
    }
    private void GoForNextActivity(){
        time=new Timer();
        if(time!=null){
            time.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent=new Intent(SecnodpageActivity.this, ThirdActivity.class);
                    startActivity(intent);
                    finish();

                }
            }, 5000);
        }
    }
    private void RunAnimation()
    {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.scale);
        a.reset();

        Bundle intentextras=getIntent().getExtras();


        //Toast.makeText(this, "You need not to agree to name", Toast.LENGTH_SHORT).show();
        nam = intentextras.getString("passdata1");//Key name should be same
        if(nam==null){
            Toast.makeText(this, "The name has not stored", Toast.LENGTH_SHORT).show();
        }
        else{
            welcome = findViewById(R.id.textViewelcome);
            welcome.setText("Hello " + nam);
            welcome.clearAnimation();
            welcome.startAnimation(a);
        }
    }

}