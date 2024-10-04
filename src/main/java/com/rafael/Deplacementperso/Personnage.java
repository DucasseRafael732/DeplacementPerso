package com.rafael.Deplacementperso;

public class Personnage {

    public Orientation tourner(int nbre) {

        nbre = nbre % 4;

        if (nbre < 0) {
            nbre += 4;
        }

        if (nbre == 0) {
            return Orientation.NORD;
        } else if (nbre == 1) {
            return Orientation.EST;
        } else if (nbre == 2) {
            return Orientation.SUD;
        } else if (nbre == 3) {
            return Orientation.OUEST;
        }

        return null;
    }
}