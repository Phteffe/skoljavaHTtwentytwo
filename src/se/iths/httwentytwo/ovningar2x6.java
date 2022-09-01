package se.iths.httwentytwo;

//Skriv ett program som frågar användaren efter ett tal mellan 1 och 100.
//Programmet ska ha ett hemligt tal lagrat i en variabel.
//Det ska fortsätta fråga användaren till dess att användaren gissar det hemliga talet.
//Om man gissade för högt eller för lågt så ska det skrivas ut, så att användaren har en rimlig chans att klara det.

import java.util.Scanner;

public class ovningar2x6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = (int) (Math.random()* 100);
        int guess = 1;

        System.out.println("Guess the secret number between 1 - 100:");

        while (true) {
            int i = s.nextInt();

            if (i == x) {
                System.out.println("Correct!");
                System.out.println("You guessed " + guess + " times!");
                break;
            } else if (i > x) {
                System.out.println("Too high! Guess again:");
                guess++;
            } else if (i < x) {
                System.out.println("Too low! Guess again:");
                guess++;
            }
        }
    }
}
