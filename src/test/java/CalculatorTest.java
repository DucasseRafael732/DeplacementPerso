import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add_devrait_calculer_la_somme_de_deux_int() {

        // GIVEN
        Calculator calculer = new Calculator();
        int opG = 1;
        int opD = 2;

        // WHEN
        int resultat = calculer.add(opG,opD);

        // THEN
        assertThat(resultat).isEqualTo(3);
    }
}