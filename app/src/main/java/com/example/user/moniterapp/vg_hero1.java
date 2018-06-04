package com.example.user.moniterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class vg_hero1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vg_hero1);
        setTheme(R.style.vg_theme);


      Intent intent = getIntent();
        //ListView buildsListView = findViewById(R.id.builds);//
        ListView countersListView = findViewById(R.id.counters);
        final int heroIndex = intent.getIntExtra("HeroName",-1);
        String heroTitle = intent.getStringExtra("HeroTitle");
        setTitle(heroTitle);


        ArrayList<Character> ar1= new  ArrayList<>();
        ArrayList<Character> required1= new  ArrayList<>();


      TextView builds = findViewById(R.id.builds_text);

      // Set a click listener on that View
      builds.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the numbers category is clicked on.
        @Override
        public void onClick(View view) {
          // Create a new intent to open the {@link NumbersActivity}
          Intent builds_Int = new Intent(vg_hero1.this, builds_page.class);
          builds_Int.putExtra("HeroName", heroIndex);
          startActivity(builds_Int);
        }
      });


        //Counters.

        ar1.add(new Character(0, "Blackfeather", R.drawable.bf));
        ar1.add(new Character(0, "Catherine", R.drawable.cat));
        ar1.add(new Character(0, "Glaive", R.drawable.glaive));
        ar1.add(new Character(0, "Krul", R.drawable.krul));
        ar1.add(new Character(0, "Skaarf", R.drawable.skaarf));

        ar1.add(new Character(1, "Lyra", R.drawable.lyra));
        ar1.add(new Character(1, "Catherine", R.drawable.cat));
        ar1.add(new Character(1, "Lance", R.drawable.lance));
        ar1.add(new Character(1, "Krul", R.drawable.krul));
        ar1.add(new Character(1, "Reim", R.drawable.reim));

        ar1.add(new Character(2, "Baron", R.drawable.baron));
        ar1.add(new Character(2, "Blackfeather", R.drawable.bf));
        ar1.add(new Character(2, "Kestrel", R.drawable.kestrel));
        ar1.add(new Character(2, "Lyra", R.drawable.lyra));
        ar1.add(new Character(2, "Petal", R.drawable.petal));
        ar1.add(new Character(2, "Taka", R.drawable.taka));


        ar1.add(new Character(3, "Gwen", R.drawable.gwen));
        ar1.add(new Character(3, "Kestrel", R.drawable.kestrel));
        ar1.add(new Character(3, "Lorelai", R.drawable.lorelai));
        ar1.add(new Character(3, "Petal", R.drawable.petal));
        ar1.add(new Character(3, "Samuel", R.drawable.samuel));
        ar1.add(new Character(3, "Skaarf", R.drawable.skaarf));


        ar1.add(new Character(4, "Idris", R.drawable.idris));
        ar1.add(new Character(4, "Koshka", R.drawable.koshka));
        ar1.add(new Character(4, "Skaarf", R.drawable.skaarf));
        ar1.add(new Character(4, "Taka", R.drawable.taka));

        ar1.add(new Character(5, "Alpha", R.drawable.alpha));
        ar1.add(new Character(5, "Fortress", R.drawable.fortress));
        ar1.add(new Character(5, "Krul", R.drawable.krul));
        ar1.add(new Character(5, "Rona", R.drawable.rona));
        ar1.add(new Character(3, "Lyra", R.drawable.lyra));
        ar1.add(new Character(3, "Skye", R.drawable.skye));

        ar1.add(new Character(6, "Baptiste", R.drawable.bap));
        ar1.add(new Character(6, "Petal", R.drawable.petal));
        ar1.add(new Character(6, "Skaarf", R.drawable.skaarf));
        ar1.add(new Character(6, "Skye", R.drawable.skye));

        ar1.add(new Character(7, "Baptiste", R.drawable.bap));
        ar1.add(new Character(7, "Glaive", R.drawable.glaive));
        ar1.add(new Character(7, "Koshka", R.drawable.koshka));
        ar1.add(new Character(7, "Idris", R.drawable.idris));
        ar1.add(new Character(7, "Taka", R.drawable.taka));
        ar1.add(new Character(7, "Reza", R.drawable.reza));

        ar1.add(new Character(8, "Alpha", R.drawable.alpha));
        ar1.add(new Character(8, "Blackfeather", R.drawable.bf));
        ar1.add(new Character(8,"Lorelai", R.drawable.lorelai));
        ar1.add(new Character(8, "Reim", R.drawable.reim));
        ar1.add(new Character(8, "Glaive", R.drawable.glaive));
        ar1.add(new Character(8,"Koshka", R.drawable.koshka));
        ar1.add(new Character(8,"Flicker", R.drawable.flicker));

        ar1.add(new Character(9, "Celeste", R.drawable.celeste));
        ar1.add(new Character(9, "Glaive", R.drawable.glaive));
        ar1.add(new Character(9,"Gwen", R.drawable.gwen));
        ar1.add(new Character(9,"Koshka", R.drawable.koshka));
        ar1.add(new Character(9, "Lance", R.drawable.lance));
        ar1.add(new Character(9, "Lorelai", R.drawable.lorelai));
        ar1.add(new Character(9,"Petal", R.drawable.petal));
        ar1.add(new Character(9,"Phinn", R.drawable.phinn));


        ar1.add(new Character(10,"Grace", R.drawable.grace));
        ar1.add(new Character(10,"Lance", R.drawable.lance));
        ar1.add(new Character(10,"Ozo", R.drawable.ozo));
        ar1.add(new Character(10,"Petal", R.drawable.petal));

        ar1.add(new Character(11,"Alpha", R.drawable.alpha));
        ar1.add(new Character(11,"Baptiste", R.drawable.bap));
        ar1.add(new Character(11,"Krul", R.drawable.krul));
        ar1.add(new Character(11,"Lance", R.drawable.lance));
        ar1.add(new Character(11,"Reim", R.drawable.reim));

        ar1.add(new Character(12,"Baptiste", R.drawable.bap));
        ar1.add(new Character(12,"Catherine", R.drawable.cat));
        ar1.add(new Character(12,"Kestrel", R.drawable.kestrel));
        ar1.add(new Character(12,"Lance", R.drawable.lance));
        ar1.add(new Character(12,"Skye", R.drawable.skye));


        ar1.add(new Character(13,"Churnwalker",R.drawable.churn));
        ar1.add(new Character(13,"Lance", R.drawable.lance));
        ar1.add(new Character(13,"Lyra", R.drawable.lyra));
        ar1.add(new Character(13,"Petal", R.drawable.petal));
        ar1.add(new Character(13,"Phinn", R.drawable.phinn));
        ar1.add(new Character(13,"Skye", R.drawable.skye));


        ar1.add(new Character(14,"Adagio",R.drawable.adagio));
        ar1.add(new Character(14,"Alpha",R.drawable.alpha));
        ar1.add(new Character(14,"Blackfeather", R.drawable.bf));
        ar1.add(new Character(14,"Koshka", R.drawable.koshka));
        ar1.add(new Character(14,"Krul", R.drawable.krul));
        ar1.add(new Character(14,"Ringo",R.drawable.ringo));

        ar1.add(new Character(15,"Blackfeather", R.drawable.bf));
        ar1.add(new Character(15,"Krul", R.drawable.krul));
        ar1.add(new Character(15,"Lyra", R.drawable.lyra));
        ar1.add(new Character(15,"Rona",R.drawable.rona));
        ar1.add(new Character(15,"Samuel", R.drawable.samuel));

        ar1.add(new Character(16,"Baptiste", R.drawable.bap));
        ar1.add(new Character(16,"Blackfeather", R.drawable.bf));
        ar1.add(new Character(16,"Catherine", R.drawable.cat));
        ar1.add(new Character(16,"Rona",R.drawable.rona));
        ar1.add(new Character(16,"Skye", R.drawable.skye));

        ar1.add(new Character(18,"Catherine", R.drawable.cat));
        ar1.add(new Character(18,"Fortress", R.drawable.fortress));
        ar1.add(new Character(18,"Glaive", R.drawable.glaive));
        ar1.add(new Character(18,"Idris",R.drawable.idris));
        ar1.add(new Character(18,"Petal", R.drawable.petal));
        ar1.add(new Character(18,"Samuel", R.drawable.samuel));

        ar1.add(new Character(19,"Baptiste", R.drawable.bap));
        ar1.add(new Character(19,"Blackfeather", R.drawable.bf));
        ar1.add(new Character(19,"Grumpjaw",R.drawable.grump));
        ar1.add(new Character(19,"Lance", R.drawable.lance));
        ar1.add(new Character(19,"Lyra", R.drawable.lyra));

        ar1.add(new Character(20,"Lance", R.drawable.lance));
        ar1.add(new Character(20,"Lorelai", R.drawable.lorelai));
        ar1.add(new Character(20,"Petal", R.drawable.petal));
        ar1.add(new Character(20,"Samuel", R.drawable.samuel));
        ar1.add(new Character(20,"Skye", R.drawable.skye));

        ar1.add(new Character(21,"Catherine", R.drawable.cat));
        ar1.add(new Character(21,"Lyra", R.drawable.lyra));
        ar1.add(new Character(21,"Phinn", R.drawable.phinn));
        ar1.add(new Character(21,"Skye", R.drawable.skye));
        ar1.add(new Character(21,"Vox",R.drawable.vox));


        ar1.add(new Character(22,"Catherine", R.drawable.cat));
        ar1.add(new Character(22,"Celeste",R.drawable.celeste));
        ar1.add(new Character(22,"Kestrel",R.drawable.kestrel));
        ar1.add(new Character(22,"Koshka", R.drawable.koshka));
        ar1.add(new Character(22,"Reza", R.drawable.reza));
        ar1.add(new Character(22,"Taka", R.drawable.taka));

        ar1.add(new Character(23,"Celeste",R.drawable.celeste));
        ar1.add(new Character(23,"Samuel", R.drawable.samuel));
        ar1.add(new Character(23,"Skaarf",R.drawable.skaarf));

        ar1.add(new Character(25,"Ardan",R.drawable.ardan));
        ar1.add(new Character(25,"Krul", R.drawable.krul));
        ar1.add(new Character(25,"Lance", R.drawable.lance));
        ar1.add(new Character(25,"Lyra", R.drawable.lyra));
        ar1.add(new Character(25,"Reim", R.drawable.reim));
        ar1.add(new Character(25,"Rona", R.drawable.rona));

        ar1.add(new Character(26,"Celeste",R.drawable.celeste));
        ar1.add(new Character(26,"Joule",R.drawable.joule));
        ar1.add(new Character(26,"Lance", R.drawable.lance));
        ar1.add(new Character(26,"Samuel", R.drawable.samuel));
        ar1.add(new Character(26,"Skaarf",R.drawable.skaarf));
        ar1.add(new Character(26,"Vox",R.drawable.vox));

        ar1.add(new Character(27,"Gwen", R.drawable.gwen));
        ar1.add(new Character(27,"Kestrel",R.drawable.kestrel));
        ar1.add(new Character(27,"Petal", R.drawable.petal));
        ar1.add(new Character(27,"Rona", R.drawable.rona));
        ar1.add(new Character(27,"Saw",R.drawable.saw));
        ar1.add(new Character(27,"Skaarf",R.drawable.skaarf));
        ar1.add(new Character(27,"Skye", R.drawable.skye));
        ar1.add(new Character(27,"Vox",R.drawable.vox));


        ar1.add(new Character(28,"Kestrel",R.drawable.kestrel));
        ar1.add(new Character(28,"Krul", R.drawable.krul));
        ar1.add(new Character(28,"Lorelai", R.drawable.lorelai));
        ar1.add(new Character(28,"Petal", R.drawable.petal));
        ar1.add(new Character(28,"Skaarf",R.drawable.skaarf));
        ar1.add(new Character(28,"Skye", R.drawable.skye));

        ar1.add(new Character(29,"Alpha", R.drawable.alpha));
        ar1.add(new Character(29,"Lyra", R.drawable.lyra));
        ar1.add(new Character(29,"Phinn", R.drawable.phinn));
        ar1.add(new Character(29,"Reim", R.drawable.reim));

        ar1.add(new Character(30,"Catherine", R.drawable.cat));
        ar1.add(new Character(30,"Flicker", R.drawable.flicker));
        ar1.add(new Character(30,"Glaive", R.drawable.glaive));
        ar1.add(new Character(30,"Kestrel",R.drawable.kestrel));
        ar1.add(new Character(30,"Lance", R.drawable.lance));
        ar1.add(new Character(30,"Taka", R.drawable.taka));

        ar1.add(new Character(31,"Catherine", R.drawable.cat));
        ar1.add(new Character(31,"Lorelai", R.drawable.lorelai));
        ar1.add(new Character(31,"Lyra", R.drawable.lyra));
        ar1.add(new Character(31,"Petal", R.drawable.petal));
        ar1.add(new Character(31,"Skye", R.drawable.skye));
        ar1.add(new Character(31,"Vox",R.drawable.vox));

        ar1.add(new Character(32,"Ardan",R.drawable.ardan));
        ar1.add(new Character(32,"Catherine", R.drawable.cat));
        ar1.add(new Character(32,"Fortress", R.drawable.fortress));
        ar1.add(new Character(32,"Glaive", R.drawable.glaive));
        ar1.add(new Character(32,"Koshka", R.drawable.koshka));
        ar1.add(new Character(32,"Taka", R.drawable.taka));

        ar1.add(new Character(33,"Celeste",R.drawable.celeste));
        ar1.add(new Character(33,"Glaive", R.drawable.glaive));
        ar1.add(new Character(33,"Grace",R.drawable.grace));
        ar1.add(new Character(33,"Joule",R.drawable.joule));
        ar1.add(new Character(33,"Rona", R.drawable.rona));
        ar1.add(new Character(33,"Skaarf",R.drawable.skaarf));
        ar1.add(new Character(33,"Skye", R.drawable.skye));
        ar1.add(new Character(33,"Vox",R.drawable.vox));

        ar1.add(new Character(34,"Alpha", R.drawable.alpha));
        ar1.add(new Character(34,"Glaive", R.drawable.glaive));
        ar1.add(new Character(34,"Samuel", R.drawable.samuel));
        ar1.add(new Character(34,"Taka", R.drawable.taka));
        ar1.add(new Character(34,"Vox",R.drawable.vox));

        ar1.add(new Character(35,"Ardan",R.drawable.ardan));
        ar1.add(new Character(35,"Baptiste", R.drawable.bap));
        ar1.add(new Character(35,"Petal", R.drawable.petal));
        ar1.add(new Character(35,"Reza", R.drawable.reza));
        ar1.add(new Character(35,"Taka", R.drawable.taka));

        ar1.add(new Character(36,"Koshka", R.drawable.koshka));
        ar1.add(new Character(36,"Lance", R.drawable.lance));
        ar1.add(new Character(36,"Lyra", R.drawable.lyra));
        ar1.add(new Character(36,"Petal", R.drawable.petal));

        ar1.add(new Character(37,"Koshka", R.drawable.koshka));
        ar1.add(new Character(37,"Krul", R.drawable.krul));
        ar1.add(new Character(37,"Reza", R.drawable.reza));
        ar1.add(new Character(37,"Taka", R.drawable.taka));

        ar1.add(new Character(38,"Koshka", R.drawable.koshka));
        ar1.add(new Character(38,"Krul", R.drawable.krul));
        ar1.add(new Character(38,"Ozo", R.drawable.ozo));
        ar1.add(new Character(38,"Reza", R.drawable.reza));
        ar1.add(new Character(38,"Taka", R.drawable.taka));

        ar1.add(new Character(39,"Adagio",R.drawable.adagio));
        ar1.add(new Character(39,"Kestrel",R.drawable.kestrel));
        ar1.add(new Character(39,"Koshka", R.drawable.koshka));
        ar1.add(new Character(39,"Lorelai", R.drawable.lorelai));
        ar1.add(new Character(39,"Ringo",R.drawable.ringo));


        for(int i=0;i<ar1.size();i++) {
        if(heroIndex==ar1.get(i).getpHeroIndexes()){
            required1.add(new Character(heroIndex,ar1.get(i).getHeroName(),ar1.get(i).getHeroImage()));
          }
        }


        wAdapter adapter1= new wAdapter(this,required1);
        countersListView.setAdapter(adapter1);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return(super.onOptionsItemSelected(item));
    }
}
