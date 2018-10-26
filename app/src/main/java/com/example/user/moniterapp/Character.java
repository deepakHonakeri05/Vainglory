package com.example.user.moniterapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Character {

    //Custom Class made to store the Hero Info
    private String pName;
    private int pHeroIndexes;
    private int pImageResource = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Character(String characterName, int image){

        pName=characterName;
        pImageResource=image;

    }

    public Character(int heroIndexes, String characterName, int image){

        pName=characterName;
        pHeroIndexes=heroIndexes;
        pImageResource=image;

    }
public String getHeroName(){ return pName;}

public int getHeroImage(){ return pImageResource; }

public int getpHeroIndexes(){
        return pHeroIndexes;
}

}
