package vasileyeNaglieh;

// Outer Class
public class Ranande {

    private String noeGavahiname = "Paye 1";    // Run time
    private static String name = "Farhad";      // Compile time

    // Non-static Nested Class : Inner Class
    public class Gavahiname {

        public void print() {
            System.out.println("Class Non Static : ");
            System.out.println(noeGavahiname);
            System.out.println(name);
        }

    }

    // static Nested Class
    public static class staticGavahiname {

        public void print() {
            System.out.println("Class Static : ");
        //    System.out.println(noeGavahiname);     in khat kar nemikonad
            System.out.println(name);
        }
    }

}
