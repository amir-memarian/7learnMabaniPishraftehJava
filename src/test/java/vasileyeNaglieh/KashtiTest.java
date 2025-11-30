package vasileyeNaglieh;

import org.junit.jupiter.api.Test;


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
        kashti.printRefrenceObject(kashti);

        kashti.printRefrenceObject(this);

    }
  
    @Test
    void protected_Method() {
        Kashti kashti = new Kashti();

        kashti.ayaDarHalHarekatAst();
    }

}
