import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    private Calculator calculer;

    @BeforeEach
    void setUp(){}

    @AfterEach
    void tearDown(){}

    @org.junit.jupiter.api.Test
    void add_devrait_avoir_la_somme_de_deux_int() {

        // GIVEN
        int opG = 1;
        int opD = 2;

        // WHEN
        int resultat = Calculator.add(opG,opD);

        // THEN
        assertThat(resultat).isEqualTo(3);
    }

    @org.junit.jupiter.api.Test
    void divide_devrait_diviser_deux_init() {

        // GIVEN
        int opG = 1;
        int opD = 2;

        // WHEN
        int resultat = Calculator.divide(opG,opD);

        // THEN
        assertThat(resultat).isEqualTo(2);
    }
}