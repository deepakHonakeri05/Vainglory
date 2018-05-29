package com.example.user.moniterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wAdapter extends ArrayAdapter<Character>  {
    
    
    public wAdapter(Context context, ArrayList<Character> ar) {
        super(context, 0, ar);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_, parent, false);

        }

        Character currentHero = getItem(position);
        TextView textView =  listItemView.findViewById(R.id.text);
       textView.setText(currentHero.getHeroName());
       
        ImageView heroPic =listItemView.findViewById(R.id.image);
        heroPic.setImageResource(currentHero.getHeroImage());
        
        return listItemView;
    }
}