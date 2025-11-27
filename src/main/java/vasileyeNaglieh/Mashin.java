package vasileyeNaglieh;

public class Mashin extends VasileyeNaglieh{ // DRY Dont Repeat Yourself

    // Data:
    boolean ayaDarBazAst;
    String mark;
    Ranande ranande;


    public Mashin(String mark){
        this.mark = mark;
    }


    // Method:
    public void bazKardanDar(){
        ayaDarBazAst = true;
    }

    public void bastanDar(){
        ayaDarBazAst = false;
    }

    public boolean ayaDarHalHarekatAst(){
        // harekat : dar baste bashad va mashine roshan bashad (rule)
        if (!ayaDarBazAst && ayaRoshanAst){
            return true;
        }else{
            return false;
        }
    }
}
