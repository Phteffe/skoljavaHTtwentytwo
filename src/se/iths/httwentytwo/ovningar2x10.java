package se.iths.httwentytwo;
//Skriv ett program som loopar och frågar användaren efter en sträng.
//Så länge som strängen inte är en tom sträng så ska programmet lägga ihop den med tidigare strängar, med ett mellanrum.
//Om användaren t.ex. har skrivit "ord1" tidigare och skriver "ord2" ska den nya strängen bli "ord1 ord2".
//Fortsätt loopa tills användaren skickar en tom sträng eller en punkt.

import java.util.Scanner;

public class ovningar2x10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.println("Enter a word:");
            String input1 = s.nextLine();

            if (".".equalsIgnoreCase(input1) || " ".equalsIgnoreCase(input1)){
                System.out.println("Finished");
                break;
            }
            input += input1 + " ";
            System.out.println(input);
        }
    }
}
