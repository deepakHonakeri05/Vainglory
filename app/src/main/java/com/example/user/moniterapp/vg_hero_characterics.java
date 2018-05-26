package com.example.user.moniterapp;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.user.moniterapp.R;

public class vg_hero_characterics extends AppCompatActivity {

    public vg_hero_characterics(String characterName,int image){
        TextView tv = findViewById(R.id.text);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
