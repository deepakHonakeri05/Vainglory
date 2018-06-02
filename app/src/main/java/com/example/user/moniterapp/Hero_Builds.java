package com.example.user.moniterapp;

public class Hero_Builds {

    private int pHeroIndex;
    private int pImageResource1 = NO_IMAGE_PROVIDED;
    private int pImageResource2= NO_IMAGE_PROVIDED;
    private int pImageResource3 = NO_IMAGE_PROVIDED;
    private int pImageResource4 = NO_IMAGE_PROVIDED;
    private int pImageResource5 = NO_IMAGE_PROVIDED;
    private int pImageResource6 = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Hero_Builds(int heroIndex,int image1,int image2, int image3,int image4, int image5, int image6){

        pHeroIndex=heroIndex;
        pImageResource1=image1;
        pImageResource2=image2;
        pImageResource3=image3;
        pImageResource4=image4;
        pImageResource5=image5;
        pImageResource6=image6;

    }

    public int getHeroIndex(){
        return pHeroIndex;
    }
    public int getHeroImage1(){ return pImageResource1; }
    public int getHeroImage2(){ return pImageResource2; }
    public int getHeroImage3(){ return pImageResource3; }
    public int getHeroImage4(){ return pImageResource4; }
    public int getHeroImage5(){ return pImageResource5; }
    public int getHeroImage6(){ return pImageResource6; }
}
