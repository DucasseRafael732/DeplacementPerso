package com.rafael.Deplacementperso;

public class Personnage {

    public Orientation tourner(int nbre, Orientation orientation) {

        nbre = nbre % 4;

        switch (orientation) {
            case NORD:
                switch (nbre) {
                    case 0: return Orientation.NORD;
                    case 1: return Orientation.EST;
                    case 2: return Orientation.SUD;
                    case 3: return Orientation.OUEST;
                }
                break;
            case EST:
                switch (nbre) {
                    case 0: return Orientation.EST;
                    case 1: return Orientation.SUD;
                    case 2: return Orientation.OUEST;
                    case 3: return Orientation.NORD;
                }
                break;
            case SUD:
                switch (nbre) {
                    case 0: return Orientation.SUD;
                    case 1: return Orientation.OUEST;
                    case 2: return Orientation.NORD;
                    case 3: return Orientation.EST;
                }
                break;
            case OUEST:
                switch (nbre) {
                    case 0: return Orientation.OUEST;
                    case 1: return Orientation.NORD;
                    case 2: return Orientation.EST;
                    case 3: return Orientation.SUD;
                }
                break;
        }

        return null;
    }
}