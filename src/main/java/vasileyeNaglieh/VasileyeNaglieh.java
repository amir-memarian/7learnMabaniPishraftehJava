package vasileyeNaglieh;

public abstract class VasileyeNaglieh {

    private boolean ayaRoshanAst;

    public boolean ayaRoshanAst() {
        return ayaRoshanAst;
    }

    protected void protectedMethod(){
        System.out.println("this method is Protected.");
    }

    public void roshan(){
        ayaRoshanAst = true;
    }

    public void khamosh(){
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHalHarekatAst();

    public abstract String getMark();
}
