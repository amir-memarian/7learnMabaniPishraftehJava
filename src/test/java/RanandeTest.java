import org.junit.jupiter.api.Test;
import vasileyeNaglieh.Ranande;

public class RanandeTest {
    @Test
    void Bayad_noe_Gavahiname_va_nam_ra_chap_kon() {
        Ranande ranande = new Ranande();
        Ranande.Gavahiname gavahiname = ranande.new Gavahiname();
        gavahiname.print();
    }

    @Test
    void Bayad_nam_ra_chap_kon() {
        Ranande.staticGavahiname staticGavahiname = new Ranande.staticGavahiname();
        staticGavahiname.print();
    }
}
