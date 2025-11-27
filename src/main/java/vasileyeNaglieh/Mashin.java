package vasileyeNaglieh;

public class Mashin extends VasileyeNaglieh implements SandoghDar, GearBox{ // DRY Dont Repeat Yourself

    // Data:
    boolean ayaDarBazAst;
    private String mark;
    int gonjayeshSandog;
    String noeDande;
    Ranande ranande;

    public Mashin(String mark, int gonjayeshSandog, String noeDande){
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
        // harekat : dar baste bashad va mashine roshan bashad (rule)
        if (!ayaDarBazAst && ayaRoshanAst){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String typeDande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }
}
