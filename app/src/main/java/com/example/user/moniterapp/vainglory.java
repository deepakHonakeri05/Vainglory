package com.example.user.moniterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class vainglory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_adapter);

        ArrayList<customArrayadapter> ar = new ArrayList<>();
        ar.add(new customArrayadapter("Adagio", R.drawable.adagio));
        ar.add(new customArrayadapter("Alpha", R.drawable.alpha));
        ar.add(new customArrayadapter("Ardan", R.drawable.ardan));
        ar.add(new customArrayadapter("Baptiste", R.drawable.bap));
        ar.add(new customArrayadapter("Baron", R.drawable.baron));
        ar.add(new customArrayadapter("Blackfeather", R.drawable.bf));
        ar.add(new customArrayadapter("Catherine", R.drawable.cat));
        ar.add(new customArrayadapter("Celeste", R.drawable.celeste));
        ar.add(new customArrayadapter("Churnwalker", R.drawable.churn));
        ar.add(new customArrayadapter("Flicker", R.drawable.flicker));
        ar.add(new customArrayadapter("Fortress", R.drawable.fortress));
        ar.add(new customArrayadapter("Glaive", R.drawable.glaive));
        ar.add(new customArrayadapter("Grace", R.drawable.grace));
        ar.add(new customArrayadapter("Grumpjaw", R.drawable.grump));
        ar.add(new customArrayadapter("Gwen", R.drawable.gwen));
        ar.add(new customArrayadapter("Idris", R.drawable.vg));
        ar.add(new customArrayadapter("Joule", R.drawable.vg));
        ar.add(new customArrayadapter("Kestrel", R.drawable.vg));
        ar.add(new customArrayadapter("Koshka", R.drawable.koshka));
        ar.add(new customArrayadapter("Krul", R.drawable.vg));
        ar.add(new customArrayadapter("Lance", R.drawable.vg));
        ar.add(new customArrayadapter("Lorelai", R.drawable.vg));
        ar.add(new customArrayadapter("Lyra", R.drawable.vg));
        ar.add(new customArrayadapter("Malene", R.drawable.vg));
        ar.add(new customArrayadapter("Ozo", R.drawable.vg));
        ar.add(new customArrayadapter("Petal", R.drawable.vg));
        ar.add(new customArrayadapter("Phinn", R.drawable.vg));
        ar.add(new customArrayadapter("Reim", R.drawable.vg));
        ar.add(new customArrayadapter("Reza", R.drawable.vg));
        ar.add(new customArrayadapter("Ringo", R.drawable.vg));
        ar.add(new customArrayadapter("Rona", R.drawable.vg));
        ar.add(new customArrayadapter("Samuel", R.drawable.samuel));
        ar.add(new customArrayadapter("Saw", R.drawable.vg));
        ar.add(new customArrayadapter("Skaarf", R.drawable.vg));
        ar.add(new customArrayadapter("Skye", R.drawable.vg));
        ar.add(new customArrayadapter("Taka", R.drawable.vg));
        ar.add(new customArrayadapter("Tony", R.drawable.vg));
        ar.add(new customArrayadapter("Varya", R.drawable.vg));
        ar.add(new customArrayadapter("Vox", R.drawable.vox));

        wAdapter adapter = new wAdapter(this, ar);

        ListView view = findViewById(R.id.list);

        view.setAdapter(adapter);


    }
}
