package se.iths.httwentytwo;
//Skriv ett program som skriver ut de jämna talen 20 till 2 i den ordningen, med hjälp av en loop.
//Tips: Modulo operatorn %

public class ovningar2x8 {
    public static void main(String[] args) {

        for (int i = 20; i > 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
