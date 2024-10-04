package com.rafael.Deplacementperso;

public class Personnage {

    public Orientation tourner(int nbre, Orientation orientation) {

        nbre = nbre % 4;

        if (orientation == Orientation.NORD) {
            if (nbre == 0) {
                return Orientation.NORD;
            } else if (nbre == 1) {
                return Orientation.EST;
            } else if (nbre == 2) {
                return Orientation.SUD;
            } else if (nbre == 3) {
                return Orientation.OUEST;
            }
        } else if (orientation == Orientation.EST) {
            if (nbre == 0) {
                return Orientation.EST;
            } else if (nbre == 1) {
                return Orientation.SUD;
            } else if (nbre == 2) {
                return Orientation.OUEST;
            } else if (nbre == 3) {
                return Orientation.NORD;
            }
        } else if (orientation == Orientation.SUD) {
            if (nbre == 0) {
                return Orientation.SUD;
            } else if (nbre == 1) {
                return Orientation.OUEST;
            } else if (nbre == 2) {
                return Orientation.NORD;
            } else if (nbre == 3) {
                return Orientation.EST;
            }
        } else if (orientation == Orientation.OUEST) {
            if (nbre == 0) {
                return Orientation.OUEST;
            } else if (nbre == 1) {
                return Orientation.NORD;
            } else if (nbre == 2) {
                return Orientation.EST;
            } else if (nbre == 3) {
                return Orientation.SUD;
            }
        }

        return null;
    }
}