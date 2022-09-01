package se.iths.httwentytwo;
//Skriv ett program som har talet 65536 i en variabel.
//Så länge som variabeln är större än 2 ska programmet loopa, skriva ut talet och sedan dela variabeln med 2.
//Tips: Division med 2 i en dator är samma sak som att skifta alla bitar ett steg höger.

public class ovningar2x9 {
    public static void main(String[] args) {

        int x = 65536;

//        for (int i = x; i > 2;) {
//            System.out.println(i);
//
//        }

        while (x>2) {
            x = x/2;
            System.out.println(x);
        }

//        for (int i = 0; x >= 2; i++) {
//            System.out.println(x);
//            x = x/2;
//        }
    }
}
