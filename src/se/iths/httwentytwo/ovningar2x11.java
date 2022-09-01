package se.iths.httwentytwo;
//Skriv ett program som frågar användaren efter ett tal.
//Programmet ska loopa så länge som talet är större än 2.
//Varje loop ska programmet välja: om talet är udda, multiplicera talet med 3 och lägg till 1.
//Om talet är jämnt, dela det med 2. Skriv ut det nya talet varje varv i loopen.

import java.util.Scanner;

public class ovningar2x11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int i= s.nextInt();

        for (; i > 2;) {
            if (i % 2 == 0){
                i = i /2;
            } else {
                i = i * 3 + 1;
            }
            System.out.println(i);
        }

    }
}

//ovning2x12
//for(int y=0; y<5; y++) {
//            for (int x = 0; x < 5; x++) {
//                if (x == y)
//                    System.out.println("#");
//                else
//                    System.out.println(".");
//            }
//            System.out.println("");
//        }
