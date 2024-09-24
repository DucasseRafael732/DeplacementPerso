import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    private Calculator calculer;

    @org.junit.jupiter.api.Test
    @BeforeEach
    void setUp(){ calculer = new Calculator();}

    @AfterEach
    void tearDown(){ calculer = null;}


    void add_devrait_calculer_la_somme_de_deux_int() {

        // GIVEN
        int opG = 1;
        int opD = 2;

        // WHEN
        int resultat = calculer.add(opG,opD);

        // THEN
        assertThat(resultat).isEqualTo(3);
    }

    @org.junit.jupiter.api.Test
    void divide_devrait_diviser_deux_init() {

        // GIVEN
        int opG = 1;
        int opD = 2;

        // WHEN
        int resultat = calculer.divide(opG,opD);

        // THEN
        assertThat(resultat).isEqualTo(2);
    }
}