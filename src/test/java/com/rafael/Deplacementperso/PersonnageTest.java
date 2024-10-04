package com.rafael.Deplacementperso;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {


    @Test
    void quand_orientation_NORD_tourner_1_devrait_orienter_vers_EST(){
        Personnage avatar = new Personnage();

        Orientation actualOrientation =avatar.tourner(1,Orientation.NORD);

        assertThat(actualOrientation).isEqualTo(Orientation.EST);
    }

    @Test
    void quand_orientation_NORD_tourner_2_devrait_orienter_vers_SUD(){
        Personnage avatar = new Personnage();

        Orientation actualOrientation =avatar.tourner(2,Orientation.NORD);

        assertThat(actualOrientation).isEqualTo(Orientation.SUD);
    }

    @Test
    void quand_orientation_NORD_tourner_3_devrait_orienter_vers_OUEST(){
        Personnage avatar = new Personnage();

        Orientation actualOrientation =avatar.tourner(3,Orientation.NORD);

        assertThat(actualOrientation).isEqualTo(Orientation.OUEST);
    }

    @Test
    void quand_orientation_NORD_tourner_4_devrait_orienter_vers_NORD(){
        Personnage avatar = new Personnage();

        Orientation actualOrientation =avatar.tourner(4,Orientation.NORD);

        assertThat(actualOrientation).isEqualTo(Orientation.NORD);
    }


    @Test
    void quand_orientation_OUEST_tourner_1_devrait_orienter_vers_NORD(){
        Personnage avatar = new Personnage();

        Orientation actualOrientation =avatar.tourner(1,Orientation.OUEST);

        assertThat(actualOrientation).isEqualTo(Orientation.NORD);
    }

}