package vasileyeNaglieh;

public abstract class VasileyeNaglieh {
    boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }

    public void khamosh(){
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHalHarekatAst();

    public abstract String getMark();
}
