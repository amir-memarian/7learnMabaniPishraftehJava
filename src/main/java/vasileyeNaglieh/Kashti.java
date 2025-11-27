package vasileyeNaglieh;

public class Kashti extends VasileyeNaglieh {

    @Override
    public String toString() {
        //return "Kashti{}";
        return super.toString();
    }

    @Override
    public boolean ayaDarHalHarekatAst() {
        return false;
    }

    @Override
    public String getMark() {
        return "vasileyeNaglieh.Kashti";
    }

    public void printRefrence() {
        System.out.println(this);
    }
}
