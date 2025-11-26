import org.junit.jupiter.api.Test;

public class MashinTest {

    class Mashin {

        // Data:
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        String mark;

        // Method:
        void roshan(){
            System.out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamosh(){
            System.out.println("Mashin khamosh ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar(){
            System.out.println("Dar baz ast");
            ayaDarMashinBazAst = true;
        }

        void bastanDar(){
            System.out.println("Dar basteh shod");
            ayaDarMashinBazAst = false;
        }

        void harekat(){
            // harekat : dar baste bashad va mashine roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("Mashin dar hale harekat ast");
            }else{
                System.out.println("Mashin park ast");
            }
        }
    }

    @Test
    void name() {
    }
}
