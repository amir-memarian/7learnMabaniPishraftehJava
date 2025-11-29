package vasileyeNaglieh;

public class Kashti extends VasileyeNaglieh {

    /*
    @Override
    protected void protectedMethod() {
        System.out.println("protected in kashti");
    }
     */

    @Override
    public String toString() {
        //return "Kashti{}";
        return super.toString();
    }


    @Override
    public boolean ayaDarHalHarekatAst() {
        protectedMethod();
        return false;
    }

    @Override
    public String getMark() {
        return "vasileyeNaglieh.Kashti";
    }

    public void printRefrence() {
        System.out.println(this);
    }

    public void printRefrenceObject(Object object){
        System.out.println(object);
    }
}
