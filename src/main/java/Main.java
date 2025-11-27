import vasileyeNaglieh.Mashin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }
        Mashin mashin = new Mashin(args[0],Integer.parseInt(args[1]),args[2]);
        System.out.println("noe mashin : " + mashin.getMark());

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Input Stream : " + s);

    }
}
