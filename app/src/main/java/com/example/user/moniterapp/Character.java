package com.example.user.moniterapp;

public class Character {

    private String pName;
    private int pHeroIndex;
    private int pImageResource = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Character(String characterName, int image){

        pName=characterName;
        pImageResource=image;

    }

    public Character(int heroIndex,String characterName, int image){

        pName=characterName;
        pHeroIndex=heroIndex;
        pImageResource=image;

    }
public String getHeroName(){ return pName;}

public int getHeroImage(){ return pImageResource; }

public int getHeroIndex(){
        return pHeroIndex;
}

}
