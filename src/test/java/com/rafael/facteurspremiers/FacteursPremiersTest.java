package com.rafael.facteurspremiers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FacteursPremiersTest {

    private List<Integer> expectedFacteurs;
    private List<Integer> actualFacteurs;


    @BeforeEach
    void setUp() {
        expectedFacteurs = new ArrayList<>();
        actualFacteurs = new ArrayList<>();
    }

    private List<Integer> listeFab(int... composants) {
        List<Integer> listeAretourner = new ArrayList<>();
        for (int i : composants)
        {
            listeAretourner.add(i);
        }
        return listeAretourner;
    }

    @Test
    void generate_1_devrait_retourner_1_liste_contenant_vide() {
        //GIVEN


        //WHEN
        actualFacteurs = FacteursPremiers.generate(1);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_2_devrait_retourner_1_liste_contenant_2() {
        //GIVEN
        expectedFacteurs.add(2);

        //WHEN
        actualFacteurs = FacteursPremiers.generate(2);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_3_devrait_retourner_1_liste_contenant_3() {
        //GIVEN
        expectedFacteurs.add(3);

        //WHEN
        actualFacteurs = FacteursPremiers.generate(3);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }


    @Test
    void generate_4_devrait_retourner_1_liste_contenant_2_2() {
        //GIVEN
        expectedFacteurs.add(2);
        expectedFacteurs.add(2);

        //WHEN
        actualFacteurs = FacteursPremiers.generate(4);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }


    @Test
    void generate_4_devrait_retourner_1_liste_contenant_2_3() {
        //GIVEN
        expectedFacteurs = listeFab(2,3);


        //WHEN
        actualFacteurs = FacteursPremiers.generate(6);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_8_devrait_retourner_1_liste_contenant_2_2_2() {
        //GIVEN
        expectedFacteurs = listeFab(2,2,2);


        //WHEN
        actualFacteurs = FacteursPremiers.generate(8);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_9_devrait_retourner_1_liste_contenant_3_3() {
        //GIVEN
        expectedFacteurs = listeFab(3,3);


        //WHEN
        actualFacteurs = FacteursPremiers.generate(9);

        assertThat(actualFacteurs).isEqualTo(expectedFacteurs);
    }

}