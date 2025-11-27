package vasileyeNaglieh;

public class Kashti extends VasileyeNaglieh {

    /*
    @Override
    protected void protectedMethod() {
        System.out.println("protected in kashti");
    }
     */


    @Override
    public boolean ayaDarHalHarekatAst() {
        protectedMethod();
        return false;
    }

    @Override
    public String getMark() {
        return "vasileyeNaglieh.Kashti";
    }
}
