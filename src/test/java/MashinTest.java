import vasileyeNaglieh.Mashin;
import vasileyeNaglieh.Ranande;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MashinTest {

    @Test
    void mashin_bayad_harekat_konad_agar_darBastehBashad_va_RoshanBashad() {
        // Given
        Mashin benz = new Mashin("Benz");
        Ranande ranande = new Ranande();

        // When
        boolean harekatMikonad = benz.ayaDarHalHarekatAst();

        // Then
        assertEquals(false, harekatMikonad);
    }
}
