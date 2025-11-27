import foroshande.Foroshande;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vasileyeNaglieh.Mashin;

public class ForoshandehMashinTest {
    @Test
    void Bayad_Tedad_Kol_Mashin_Haye_ForokhtehShodeh_ra_bedast_avarim() {
        Foroshande ali = new Foroshande();
        Foroshande amir = new Foroshande();

        ali.foroshMashin();
        ali.foroshMashin();
        ali.foroshMashin();
        ali.foroshMashin();
        amir.foroshMashin();

        //Mashin mashin = new Mashin();
        //System.out.println("Object in mashin Class : " + mashin);
        //Assertions.assertEquals(1, mashin.tedadForosh);
        Assertions.assertEquals(5, Mashin.tedadForosh);

    }
}
