package vasileyeNaglieh;

public class Mashin { // DRY Dont Repeat Yourself

    // Data:
    boolean ayaRoshanAst;
    boolean ayaDarBazAst;
    String mark;
    Ranande ranande;

    // Constractor: 1-6
    /*public Mashin(){
        out.println("Yek mashin.Mashin bedone data sakhteh shod");
    }*/

    public Mashin(String mark){
        this.mark = mark;
     //   out.println("Yek mashin.Mashin " + this.mark + " Sakhteh shod");
    }


    // Method:
    public void roshan(){
        //out.println("mashin.Mashin roshan ast");
        ayaRoshanAst = true;
    }

    public void khamosh(){
        //out.println("mashin.Mashin khamosh ast");
        ayaRoshanAst = false;
    }

    public void bazKardanDar(){
        //out.println("Dar baz ast");
        ayaDarBazAst = true;
    }

    public void bastanDar(){
        //out.println("Dar basteh shod");
        ayaDarBazAst = false;
    }

    public boolean ayaDarHalHarekatAst(){
        // harekat : dar baste bashad va mashine roshan bashad (rule)
        if (!ayaDarBazAst && ayaRoshanAst){
            //out.println("mashin.Mashin dar hale harekat ast");
            return true;
        }else{
            //out.println("mashin.Mashin park ast");
            return false;
        }
    }
}
