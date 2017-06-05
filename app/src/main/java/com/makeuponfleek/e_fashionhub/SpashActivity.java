package com.makeuponfleek.e_fashionhub;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SpashActivity extends AppCompatActivity {
    private static int SPASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SpashActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },SPASH_TIME_OUT);
    }
}
