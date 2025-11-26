import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class MashinTest {

    @Test
    void mashin_bayad_harekat_konad_agar_darBastehBashad_va_mashinRoshanBashad() {
        // Given
        Mashin benz = new Mashin("Benz");

        // When
        boolean harekatMikonad = benz.ayaMashinDarHalHarekatAst();

        // Then
        Assertions.assertEquals(false,harekatMikonad);

     /*   // Object Mashin
        Mashin mashin = new Mashin();
        mashin.bazKardanDar();
        mashin.bastanDar();

        System.out.println("Dar Mashin Baz Ast ? " + mashin.ayaDarMashinBazAst);
        mashin.harekat();

        System.out.println("-----------------------------");

        Mashin pride = new Mashin("pride");
        pride.roshan();
        System.out.println("Yek mashin pride sakhteh shod");
        pride.harekat();*/
    }

    class Mashin {

        // Data:
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        String mark;

        // Constractor: 1-6
        Mashin(){
            out.println("Yek Mashin bedone data shakhteh shod");
        }

        Mashin(String mark){
            this.mark = mark;
        }


        // Method:
        void roshan(){
            out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamosh(){
            out.println("Mashin khamosh ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar(){
            out.println("Dar baz ast");
            ayaDarMashinBazAst = true;
        }

        void bastanDar(){
            out.println("Dar basteh shod");
            ayaDarMashinBazAst = false;
        }

        boolean ayaMashinDarHalHarekatAst(){
            // harekat : dar baste bashad va mashine roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
                out.println("Mashin dar hale harekat ast");
                return true;
            }else{
                out.println("Mashin park ast");
                return false;
            }
        }
    }


}
