package com.example.user.moniterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;


public class vg_hero1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vg_hero1);
        setTheme(R.style.vg_theme);

        Intent intent = getIntent();
        ListView buildsListView = findViewById(R.id.builds);
        ListView countersListView = findViewById(R.id.counters);
        int heroIndex = intent.getIntExtra("HeroName",-1);

        ArrayList<Hero_Builds> required = new ArrayList<>();
        ArrayList<Hero_Builds> ar = new ArrayList<>();
        ar.add(new Hero_Builds(39,R.drawable.poisoned_shiv,R.drawable.breaking_point,R.drawable.sorrowblade,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(39,R.drawable.alternating_current,R.drawable.dragon_eye,R.drawable.broken_myth,R.drawable.eve_of_harvest,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(14,R.drawable.tension_bow,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(2,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.war_treads,R.drawable.atlas_pauldron,R.drawable.echo,R.drawable.contraption));

        for(int i=0;i<ar.size();i++){
            if(ar.get(i).getHeroIndex()==heroIndex){
                required.add(new Hero_Builds(heroIndex,ar.get(i).getHeroImage1(),ar.get(i).getHeroImage2(),ar.get(i).getHeroImage3(),ar.get(i).getHeroImage4(),ar.get(i).getHeroImage5(),ar.get(i).getHeroImage6()));
            }
        }

        buildsAdapter adapter = new buildsAdapter(this,required);
        buildsListView.setAdapter(adapter);


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
