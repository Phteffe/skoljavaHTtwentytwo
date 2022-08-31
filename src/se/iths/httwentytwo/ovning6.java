package se.iths.httwentytwo;
import java.util.Scanner;

//Skriv ett program som frågar användaren efter två tal och skriver ut deras medelvärde.
//Exempel: om talen är 3 och 5 ska programmet skriva ut 4.

public class ovning6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Mata in 2 tal");
        int x = s.nextInt(), y = s.nextInt();

        double aver = (double) (x + y) / 2;

        System.out.println(aver);

    }
}
