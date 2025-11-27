import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vasileyeNaglieh.*;

public class NameVasileyeNagliehChapKonTest {
    @Test
    void Bayad_Name_VasileyeNaglieh_ra_Chap_Konad() {
        //Given
        VasileyeNaglieh benz = new Mashin("Benz", 120, "Automatic");
        VasileyeNaglieh volvo = new Mashin("Volvo", 80, "Dasti");
        VasileyeNaglieh motor = new Motor();
        VasileyeNaglieh kashti = new Kashti();

        VasileyeNaglieh[] vasileyeNagliehs = {benz, volvo, motor, kashti};
        NameVasileyeNagliehChapKon nameVasileyeNagliehChapKon = new NameVasileyeNagliehChapKon(vasileyeNagliehs);

        //when
        String listNameVasileyeNaglieh = nameVasileyeNagliehChapKon.execute();

        //then
        Assertions.assertEquals("Benz-Volvo-Motor-vasileyeNaglieh.Kashti",listNameVasileyeNaglieh);
    }
}
