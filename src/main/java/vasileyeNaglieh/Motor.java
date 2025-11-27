package vasileyeNaglieh;

public class Motor {

    boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }

    public void khamosh(){
        ayaRoshanAst = false;
    }

    public boolean ayaDarHalHarekatAst() {
        return ayaRoshanAst;
    }
}
