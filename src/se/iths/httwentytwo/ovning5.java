package se.iths.httwentytwo;
import java.util.Scanner;
//Skriv ett program som frågar användaren efter ett decimaltal.
//Programmet ska läsa in det, spara i en variabel, omvandla det till ett heltal och skriva ut.
// (Ska man använda , eller . i konsolen?)
public class ovning5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Skriv in ett decimal tal");
        double x = s.nextDouble();

        int y = (int) Math.round(x);
        System.out.println( x + " avrundas till " + y);

    }
}
