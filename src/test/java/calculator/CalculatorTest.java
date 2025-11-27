package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Jam_Konad() {
        Calculator calculator = new Calculator();

        String haselJamDoAdad = calculator.add("5.3","-2");

        Assertions.assertEquals("3.3",haselJamDoAdad);
    }
}
