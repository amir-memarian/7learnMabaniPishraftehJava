package vasileyeNaglieh.mashin;

import vasileyeNaglieh.GearBox;
import vasileyeNaglieh.Ranande;
import vasileyeNaglieh.SandoghDar;
import vasileyeNaglieh.VasileyeNaglieh;

public class Mashin extends VasileyeNaglieh implements SandoghDar, GearBox {

    public static int tedadForosh;

    // DRY Dont Repeat Yourself
    // Data:
    private boolean ayaDarBazAst;
    private String mark;
    private int gonjayeshSandog;
    private Dande noeDande;
    private Ranande ranande;

    public Mashin(){

    }

    public Mashin(String mark, int gonjayeshSandog, Dande noeDande){
        this.mark = mark;
        this.gonjayeshSandog = gonjayeshSandog;
        this.noeDande = noeDande;
    }

    @Override
    public String getMark() {
        return mark;
    }

    // Method:
    public void bazKardanDar(){
        ayaDarBazAst = true;
    }

    public void bastanDar(){
        ayaDarBazAst = false;
    }

    public boolean ayaDarHalHarekatAst(){
        protectedMethod();
        // harekat : dar baste bashad va mashine roshan bashad (rule)
        if (!ayaDarBazAst && ayaRoshanAst()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Dande typeDande() {
        return noeDande;
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }

    public String toString(){
        return "Mashin{"+
                "ayaDarBazAst :: " + this.ayaDarBazAst +
                ", mark :: '" + this.mark + "'" +
                ", gojayeshSandogh :: " + this.gonjayeshSandog +
                ", noeDande :: '" + this.noeDande + " - " + this.noeDande.getToPersion() + "'" +
                ", ranade :: " + this.ranande +
                "}";
    }
}
