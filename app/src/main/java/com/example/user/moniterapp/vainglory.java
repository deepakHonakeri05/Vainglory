package com.example.user.moniterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;



public class vainglory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_adapter);



        ArrayList<Character> ar = new ArrayList<>();
        ar.add(new Character("Adagio", R.drawable.adagio));
        ar.add(new Character("Alpha", R.drawable.alpha));
        ar.add(new Character("Ardan", R.drawable.ardan));
        ar.add(new Character("Baptiste", R.drawable.bap));
        ar.add(new Character("Baron", R.drawable.baron));
        ar.add(new Character("Blackfeather", R.drawable.bf));
        ar.add(new Character("Catherine", R.drawable.cat));
        ar.add(new Character("Celeste", R.drawable.celeste));
        ar.add(new Character("Churnwalker", R.drawable.churn));
        ar.add(new Character("Flicker", R.drawable.flicker));
        ar.add(new Character("Fortress", R.drawable.fortress));
        ar.add(new Character("Glaive", R.drawable.glaive));
        ar.add(new Character("Grace", R.drawable.grace));
        ar.add(new Character("Grumpjaw", R.drawable.grump));
        ar.add(new Character("Gwen", R.drawable.gwen));
        ar.add(new Character("Idris", R.drawable.idris));
        ar.add(new Character("Joule", R.drawable.vg));
        ar.add(new Character("Kensei", R.drawable.vg));
        ar.add(new Character("Kestrel", R.drawable.vg));
        ar.add(new Character("Koshka", R.drawable.koshka));
        ar.add(new Character("Krul", R.drawable.vg));
        ar.add(new Character("Lance", R.drawable.vg));
        ar.add(new Character("Lorelai", R.drawable.vg));
        ar.add(new Character("Lyra", R.drawable.vg));
        ar.add(new Character("Malene", R.drawable.vg));
        ar.add(new Character("Ozo", R.drawable.vg));
        ar.add(new Character("Petal", R.drawable.vg));
        ar.add(new Character("Phinn", R.drawable.vg));
        ar.add(new Character("Reim", R.drawable.vg));
        ar.add(new Character("Reza", R.drawable.vg));
        ar.add(new Character("Ringo", R.drawable.vg));
        ar.add(new Character("Rona", R.drawable.vg));
        ar.add(new Character("Samuel", R.drawable.samuel));
        ar.add(new Character("Saw", R.drawable.vg));
        ar.add(new Character("Skaarf", R.drawable.vg));
        ar.add(new Character("Skye", R.drawable.vg));
        ar.add(new Character("Taka", R.drawable.vg));
        ar.add(new Character("Tony", R.drawable.vg));
        ar.add(new Character("Varya", R.drawable.vg));
        ar.add(new Character("Vox", R.drawable.vox));

        wAdapter adapter = new wAdapter(this, ar);

        ListView view = findViewById(R.id.list);

        view.setAdapter(adapter);

    }

    public void  startAct (View view){

        Intent vgHeroIntent = new Intent(vainglory.this, vgheros.class);
        startActivity(vgHeroIntent);
    }
}
