import vasileyeNaglieh.Motor;
import org.junit.jupiter.api.Test;
import vasileyeNaglieh.VasileyeNaglieh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {

    @Test
    void motor_bayad_harekat_konad_agar_RoshanBashad() {
        //Given
        VasileyeNaglieh motor = new Motor();
        //When
        motor.roshan();
        boolean harekatMikonad = motor.ayaDarHalHarekatAst();

        //Then
        assertTrue(harekatMikonad);

    }
}
