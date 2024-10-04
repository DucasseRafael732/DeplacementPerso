package com.rafael.Deplacementperso;

public class Personnage {

    public Orientation tourner(int nbre){

        for (int i = 0; i < nbre; i++) {
            if(nbre == 1){
                return Orientation.EST;
            }
            if(nbre == 2){
                return Orientation.SUD;
            }
            if(nbre == 3){
                return Orientation.OUEST;
            }

        }
       return Orientation.NORD;
    }
}
