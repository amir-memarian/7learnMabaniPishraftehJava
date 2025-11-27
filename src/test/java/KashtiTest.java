import org.junit.jupiter.api.Test;
import vasileyeNaglieh.Kashti;
import vasileyeNaglieh.VasileyeNaglieh;

 
public class KashtiTest {
    @Test
    void super_keyword() {
        VasileyeNaglieh kashti01 = new Kashti();
        VasileyeNaglieh kashti02 = new Kashti();

        System.out.println(kashti01.toString());
        System.out.println(kashti02.toString());
    }

    @Test
    void this_keyword() {
        Kashti kashti = new Kashti();

        kashti.printRefrence();

    }
  
    @Test
    void protected_Method() {
        Kashti kashti = new Kashti();

        kashti.ayaDarHalHarekatAst();
    }

}
