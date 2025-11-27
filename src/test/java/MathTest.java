import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void Bayad_amaliat_Riazi_Anjam_Dahad() {
        double moteghayer = -1.5;

        double meghdarMotlagh = Math.abs(moteghayer);

        Assertions.assertEquals(1.5,meghdarMotlagh);
    }
}
