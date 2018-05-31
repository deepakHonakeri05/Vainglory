package com.example.user.moniterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
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
        ar.add(new Character("Joule", R.drawable.joule));
        ar.add(new Character("Kensei", R.drawable.kensei));
        ar.add(new Character("Kestrel", R.drawable.kestrel));
        ar.add(new Character("Koshka", R.drawable.koshka));
        ar.add(new Character("Krul", R.drawable.krul));
        ar.add(new Character("Lance", R.drawable.lance));
        ar.add(new Character("Lorelai", R.drawable.lorelai));
        ar.add(new Character("Lyra", R.drawable.lyra));
        ar.add(new Character("Malene", R.drawable.malene));
        ar.add(new Character("Ozo", R.drawable.ozo));
        ar.add(new Character("Petal", R.drawable.petal));
        ar.add(new Character("Phinn", R.drawable.phinn));
        ar.add(new Character("Reim", R.drawable.reim));
        ar.add(new Character("Reza", R.drawable.reza));
        ar.add(new Character("Ringo", R.drawable.ringo));
        ar.add(new Character("Rona", R.drawable.rona));
        ar.add(new Character("Samuel", R.drawable.samuel));
        ar.add(new Character("Saw", R.drawable.saw));
        ar.add(new Character("Skaarf", R.drawable.skaarf));
        ar.add(new Character("Skye", R.drawable.skye));
        ar.add(new Character("Taka", R.drawable.taka));
        ar.add(new Character("Tony", R.drawable.tony));
        ar.add(new Character("Varya", R.drawable.varya));
        ar.add(new Character("Vox", R.drawable.vox));

        wAdapter adapter = new wAdapter(this, ar);
    }

}
