package com.example.user.moniterapp;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView gtaV = findViewById(R.id.gtaV);

        // Set a click listener on that View
        gtaV.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent gtaVIntent = new Intent(MainActivity.this, gtaV_Int.class);

                // Start the new activity
                startActivity(gtaVIntent);
            }
        });

        TextView vainglory = findViewById(R.id.vainGlory);
        vainglory.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent vaingloryIntent = new Intent(MainActivity.this, vainglory.class);

                // Start the new activity
                startActivity(vaingloryIntent);
            }
        });

    }

}
