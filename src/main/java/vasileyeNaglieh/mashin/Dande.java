package vasileyeNaglieh.mashin;

public enum Dande {
    AUTOMATIC("otomatic","Automatique"),
    MANUAL("dasti","Manual");

    private final String toPersion;
    private final String toFrench;
    Dande(String toPersion, String toFrench) {
        this.toPersion = toPersion;
        this.toFrench = toFrench;

    }

    public static void print() {
        Dande[] values = Dande.values();
        for (int index=0;index < values.length; index++){
            System.out.println(values[index]);
        }
    }

    public static void print_toPersion() {
        Dande[] values = Dande.values();
        for (int index=0;index < values.length; index++){
            System.out.println(values[index].toPersion);

        }
    }

    public static void print_toFrench() {
        Dande[] values = Dande.values();
        for (int index=0;index < values.length; index++){
            System.out.println(values[index].toFrench);

        }
    }

    public String getToPersion() {
        return toPersion;
    }

    public String getToFrench() {
        return toFrench;
    }
}
