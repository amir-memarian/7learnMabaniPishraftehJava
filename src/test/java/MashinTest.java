import vasileyeNaglieh.mashin.Dande;
import vasileyeNaglieh.mashin.Mashin;
import vasileyeNaglieh.Ranande;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MashinTest {

    @Test
    void mashin_bayad_harekat_konad_agar_darBastehBashad_va_RoshanBashad() {
        // Given
        Mashin benz = new Mashin("Benz", 120, Dande.MANUAL);
        Ranande ranande = new Ranande();

        // When
        boolean harekatMikonad = benz.ayaDarHalHarekatAst();

        // Then
        assertEquals(false, harekatMikonad);
    }

    @Test
    void Bayad_print_konad() {
        Mashin pejo = new Mashin("Pejo", 67, Dande.MANUAL);

        System.out.println(pejo.toString());
    }
}
