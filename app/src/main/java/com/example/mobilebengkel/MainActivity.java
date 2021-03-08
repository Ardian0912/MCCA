package com.example.mobilebengkel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static int timeout = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing);
        final View myLayout = findViewById(R.id.startscreen);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(i);
                finish();
            }
        },timeout);
    }
}
