package se.iths.httwentytwo;

//Skriv ett program som ber användaren skriva in en månad.
//Programmet ska göra om månaden till månadens siffervärde.
//T.ex. ska januari bli 1 och december 12. Använd switch.
//IntelliJ kommer troligen föreslå en enhanced switch.

import java.util.Scanner;

public class ovningar2x5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a month:");
        String month = s.next();

        switch (month){
            case "January" -> System.out.println("1");
            case "February" -> System.out.println("2");
            case "March" -> System.out.println("3");
            case "April" -> System.out.println("4");
            case "May" -> System.out.println("5");
            case "June" -> System.out.println("6");
            case "July" -> System.out.println("7");
            case "August" -> System.out.println("8");
            case "September" -> System.out.println("9");
            case "October" -> System.out.println("10");
            case "November" -> System.out.println("11");
            case "December" -> System.out.println("12");
        }

    }
}
