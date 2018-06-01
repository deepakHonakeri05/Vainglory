package com.example.user.moniterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class buildsAdapter extends ArrayAdapter<Hero_Builds> {


    public buildsAdapter(Context context, ArrayList<Hero_Builds> ar) {
        super(context, 0, ar);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_builds, parent, false);

        }

        Hero_Builds currentHero = getItem(position);
        ImageView itemPic1 = listItemView.findViewById(R.id.image1);
        itemPic1.setImageResource(currentHero.getHeroImage1());

        ImageView itemPic2 = listItemView.findViewById(R.id.image2);
        itemPic2.setImageResource(currentHero.getHeroImage2());

        ImageView itemPic3 = listItemView.findViewById(R.id.image3);
        itemPic3.setImageResource(currentHero.getHeroImage3());

        ImageView itemPic4 = listItemView.findViewById(R.id.image4);
        itemPic4.setImageResource(currentHero.getHeroImage4());

        ImageView itemPic5 = listItemView.findViewById(R.id.image5);
        itemPic5.setImageResource(currentHero.getHeroImage5());

        ImageView itemPic6 = listItemView.findViewById(R.id.image6);
        itemPic6.setImageResource(currentHero.getHeroImage6());

        return listItemView;
    }
}