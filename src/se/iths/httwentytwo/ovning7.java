package se.iths.httwentytwo;

import java.util.Scanner;
//Skriv ett program som räknar ut saldot på ett bankkonto efter ränta.
//Det ska fråga efter hur mycket pengar användaren har på kontot och vilken räntesats det är.
//Om räntesatsen är 2% så skriver man det som decimaltalet 0.02.
//Om det gamla saldot är 512 kr så blir det nya: 512 * 1.02 == 522.24.

public class ovning7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("hur monga bengar haver du?");
        double saldo = s.nextDouble();
        System.out.println("og hur hog reeenta?");
        double renta = s.nextDouble();
        double sum = saldo * renta;
        System.out.println(sum);

    }
}
