package vasileyeNaglieh;

public class NameVasileyeNagliehChapKon {
    VasileyeNaglieh[] vasileyeNagliehs;

    public NameVasileyeNagliehChapKon(VasileyeNaglieh[] vasileyeNagliehs) {
        this.vasileyeNagliehs = vasileyeNagliehs;
    }

    public String execute() {
        String nameVasileyeNagliehs = "";

        for(int neshanegar = 0; neshanegar < vasileyeNagliehs.length; neshanegar++){
            VasileyeNaglieh vasileyeNaglieh = vasileyeNagliehs[neshanegar];
            if(neshanegar != vasileyeNagliehs.length-1){
                nameVasileyeNagliehs = nameVasileyeNagliehs + vasileyeNaglieh.getMark() + "-";
            }else{
                nameVasileyeNagliehs = nameVasileyeNagliehs + vasileyeNaglieh.getMark();
            }

        }
        return nameVasileyeNagliehs;
    }
}
