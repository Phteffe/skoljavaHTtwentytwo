package se.iths.httwentytwo;

import java.util.Scanner;
//Skriv ett program som frågar användaren efter ett tal.
//Det ska skriva ut om talet är mindre än 100, lika med 100 eller större.

public class ovningar2x4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a integer");
        int i = s.nextInt();

        if (i < 100) {
            System.out.println(i + " is smaller than 100");
        } else if (i == 100) {
            System.out.println(i + " is 100");
        } else {
            System.out.println(i + " is bigger than 100");
        }


    }
}
