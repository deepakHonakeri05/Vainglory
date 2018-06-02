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
        ar.add(new Hero_Builds(38,R.drawable.alternating_current,R.drawable.dragon_eye,R.drawable.eve_of_harvest,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(38,R.drawable.shatterglass,R.drawable.dragon_eye,R.drawable.clockwork,R.drawable.spellfire,R.drawable.broken_myth,R.drawable.journey_boots));
        ar.add(new Hero_Builds(37,R.drawable.tension_bow,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(37,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.atlas_pauldron,R.drawable.war_treads,R.drawable.shiversteel,R.drawable.slumbering_husk));
        ar.add(new Hero_Builds(36,R.drawable.tension_bow,R.drawable.spellsword,R.drawable.breaking_point,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.journey_boots));
        ar.add(new Hero_Builds(36,R.drawable.aftershock,R.drawable.clockwork,R.drawable.broken_myth,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(36,R.drawable.aftershock,R.drawable.clockwork,R.drawable.tension_bow,R.drawable.spellsword,R.drawable.aegis,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(35,R.drawable.frostburn,R.drawable.eve_of_harvest,R.drawable.spellfire,R.drawable.aegis,R.drawable.shatterglass,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(35,R.drawable.poisoned_shiv,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(34,R.drawable.eve_of_harvest,R.drawable.frostburn,R.drawable.spellfire,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(34,R.drawable.shatterglass,R.drawable.spellfire,R.drawable.broken_myth,R.drawable.halcyon_chargers,R.drawable.aegis,R.drawable.slumbering_husk));
        ar.add(new Hero_Builds(33,R.drawable.serpant_mask,R.drawable.breaking_point,R.drawable.tyrants_monocle,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.journey_boots));
        ar.add(new Hero_Builds(33,R.drawable.serpant_mask,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.slumbering_husk,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(33,R.drawable.shatterglass,R.drawable.eve_of_harvest,R.drawable.broken_myth,R.drawable.spellfire,R.drawable.halcyon_chargers,R.drawable.slumbering_husk));
        ar.add(new Hero_Builds(32,R.drawable.dragon_eye,R.drawable.eve_of_harvest,R.drawable.clockwork,R.drawable.broken_myth,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(32,R.drawable.dragon_eye,R.drawable.eve_of_harvest,R.drawable.broken_myth,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(31,R.drawable.serpant_mask,R.drawable.breaking_point,R.drawable.sorrowblade,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(31,R.drawable.alternating_current,R.drawable.shatterglass,R.drawable.broken_myth,R.drawable.slumbering_husk,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(30,R.drawable.spellsword,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(30,R.drawable.spellsword,R.drawable.breaking_point,R.drawable.tyrants_monocle,R.drawable.tornado_trigger,R.drawable.slumbering_husk,R.drawable.journey_boots));
        ar.add(new Hero_Builds(30,R.drawable.alternating_current,R.drawable.shatterglass,R.drawable.dragon_eye,R.drawable.aegis,R.drawable.broken_myth,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(29,R.drawable.aftershock,R.drawable.stormcrown,R.drawable.clockwork,R.drawable.aegis,R.drawable.broken_myth,R.drawable.journey_boots));
        ar.add(new Hero_Builds(28,R.drawable.eve_of_harvest,R.drawable.dragon_eye,R.drawable.broken_myth,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(28,R.drawable.eve_of_harvest,R.drawable.dragon_eye,R.drawable.clockwork,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.halcyon_chargers));
        

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
