package com.example.user.moniterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class vg_hero1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vg_hero1);

        Intent intent = getIntent();
        int heroIndex = intent.getIntExtra("HeroName",-1);
        Log.i("Hero Selected is:",""+heroIndex);
    }
}
