package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο Frog βρίσκεται στη θέση Χ και θέλει να φτάσει στη
 * θέση Υ ή σε θέση μεγαλύτερη από τη θέση Υ. Ο Frog κάνει
 * άλματα σταθερής απόστασης D.
 *
 * Βρείτε τον ελάχιστο αριθμό αλμάτων που ο Frog πρέπει να κάνει
 * ώστε να φτάσει ή να ξεπεράσει το στόχο του
 *
 * Παράδειγμα: Αν Χ = 10, Υ = 85 και D = 30, τότε ο Frog θα χρειαστεί
 * 3 άλματα
 *
 * @author CF
 */
public class FrogApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int position = 0;
        int goal = 0;
        final int JUMP_DISTANCE = 30;
        int jumps = 0;

        System.out.println("Please insert position and distance");
        position = in.nextInt();
        goal = in.nextInt();

//        for (int i = position; i < goal; i = i + JUMP_DISTANCE) {
//            System.out.println(position);
//            jumps ++;
//        }

        jumps = (int) Math.ceil((goal - position) / (double) JUMP_DISTANCE);

        System.out.println("Number of jumps: " + jumps);
    }
}
