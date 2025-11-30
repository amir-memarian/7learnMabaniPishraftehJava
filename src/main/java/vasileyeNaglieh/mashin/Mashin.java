package vasileyeNaglieh.mashin;

import vasileyeNaglieh.GearBox;
import vasileyeNaglieh.Ranande;
import vasileyeNaglieh.SandoghDar;
import vasileyeNaglieh.VasileyeNaglieh;

import java.util.Objects;

public class Mashin extends VasileyeNaglieh implements SandoghDar, GearBox, Comparable<Mashin> {

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mashin mashin = (Mashin) o;
        return gonjayeshSandog == mashin.gonjayeshSandog && Objects.equals(mark, mashin.mark) && noeDande == mashin.noeDande;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, gonjayeshSandog, noeDande);
    }

    @Override
    public int compareTo(Mashin mashinDigar) {
        int compareGonjayeshSandog = Integer.compare(this.gonjayeshSandog,mashinDigar.gonjayeshSandog);
        if (compareGonjayeshSandog == 0) { // barabar bodan gonjayeshSandog
            if(Objects.equals(this.noeDande,Dande.MANUAL)){
                return 1;
            }else{
                return -1;
            }
        }
        return Integer.compare(this.gonjayeshSandog,mashinDigar.gonjayeshSandog);
    }
}
