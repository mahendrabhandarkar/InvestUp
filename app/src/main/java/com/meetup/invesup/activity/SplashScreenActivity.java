package com.meetup.invesup.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.meetup.invesup.R;
/**
 * Created by Nikhil Gardi on 27/06/2023
 */
public class SplashScreenActivity extends AppCompatActivity {

    static int TIMEOUT_MILLIS=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreenActivity.this,SignInActivity.class);
                startActivity(i);
                finish();
            }
        },TIMEOUT_MILLIS);
    }
}