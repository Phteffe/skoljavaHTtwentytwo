package se.iths.httwentytwo;

import java.util.Scanner;
//Skriv ett program som frågar användaren efter ett lösenord.
//Hitta på ett hemligt lösenord och spara det i en variabel.
//När användaren har skrivit in ett ord ska programmet jämföra med det sparade lösenordet och skriva ut om det var rätt eller inte.
//Använd en if-sats

public class ovningar2x3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String spw = "Stefan";

        System.out.println("Enter password:");
        String pw = s.next();

        if (!pw.equals(spw)) {
            System.out.println("Incorrect");
        } else {
            System.out.println("Correct");
        }

    }
}
