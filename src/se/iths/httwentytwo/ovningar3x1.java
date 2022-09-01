package se.iths.httwentytwo;
//Skriv ett program som frågar användaren efter ett decimaltal.
//Använd double.Parse för att försöka konvertera strängen till ett tal.
//Om användaren skriver in något som inte går att konvertera till en double
//så ska programmet skriva ut ett felmeddelande och be användaren försöka igen.
//Använd try/catch för att fånga Exceptions.

import java.util.Scanner;

public class ovningar3x1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number with decimals:");
            String input = s.next();

            try {
                double input1 = Double.parseDouble(input);
                System.out.println(input1);
                break;
            } catch (Exception e) {
                System.out.println("Something went wrong.");
                continue;
            }
        }
    }
}
