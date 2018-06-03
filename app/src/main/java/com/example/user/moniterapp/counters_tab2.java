package com.example.user.moniterapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class counters_tab2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.build_tab1, container, false);

        int heroIndex = this.getArguments().getInt("Hero Index");

        ListView countersListView = rootView.findViewById(R.id.counters);

        ArrayList<Character> ar1 = new ArrayList<>();
        ArrayList<Character> required1 = new ArrayList<>();


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
        ar1.add(new Character(4, "Skaatf", R.drawable.skaarf));
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
        ar1.add(new Character(8, "Lorelai", R.drawable.lorelai));
        ar1.add(new Character(8, "Reim", R.drawable.reim));
        ar1.add(new Character(8, "Glaive", R.drawable.glaive));
        ar1.add(new Character(8, "Koshka", R.drawable.koshka));
        ar1.add(new Character(8, "Flicker", R.drawable.flicker));

        ar1.add(new Character(9, "Celeste", R.drawable.celeste));
        ar1.add(new Character(9, "Glaive", R.drawable.glaive));
        ar1.add(new Character(9, "Gwen", R.drawable.gwen));
        ar1.add(new Character(9, "Koshka", R.drawable.koshka));
        ar1.add(new Character(9, "Lance", R.drawable.lance));
        ar1.add(new Character(9, "Lorelai", R.drawable.lorelai));
        ar1.add(new Character(9, "Petal", R.drawable.petal));
        ar1.add(new Character(9, "Phinn", R.drawable.phinn));


        ar1.add(new Character(10, "Grace", R.drawable.grace));
        ar1.add(new Character(10, "Lance", R.drawable.lance));
        ar1.add(new Character(10, "Ozo", R.drawable.ozo));
        ar1.add(new Character(10, "Petal", R.drawable.petal));

        ar1.add(new Character(11, "Alpha", R.drawable.alpha));
        ar1.add(new Character(11, "Baptiste", R.drawable.bap));
        ar1.add(new Character(11, "Krul", R.drawable.krul));
        ar1.add(new Character(11, "Lance", R.drawable.lance));
        ar1.add(new Character(11, "Reim", R.drawable.reim));

        ar1.add(new Character(12, "Baptiste", R.drawable.bap));
        ar1.add(new Character(12, "Catherine", R.drawable.cat));
        ar1.add(new Character(12, "Kestrel", R.drawable.kestrel));
        ar1.add(new Character(12, "Lance", R.drawable.lance));
        ar1.add(new Character(12, "Skye", R.drawable.skye));

        for (int i = 0; i < ar1.size(); i++) {
            if (heroIndex == ar1.get(i).getpHeroIndexes()) {
                required1.add(new Character(heroIndex, ar1.get(i).getHeroName(), ar1.get(i).getHeroImage()));
            }
        }

       /* wAdapter adapter1 = new wAdapter(getContext(), required1);
        countersListView.setAdapter(adapter1);*/

    return  rootView;
    }
}

