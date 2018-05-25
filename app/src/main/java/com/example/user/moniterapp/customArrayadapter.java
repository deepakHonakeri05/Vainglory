package com.example.user.moniterapp;

public class customArrayadapter {

    private String pName;
    private int pImageResource = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public customArrayadapter(String characterName,int image){

        pName=characterName;
        pImageResource=image;

    }
public String getName12(){ return pName;}

public int getImage(){ return pImageResource; }
}
