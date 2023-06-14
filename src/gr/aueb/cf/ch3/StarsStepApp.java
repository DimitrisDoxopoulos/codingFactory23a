package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει star, end και step
 * και εκτυπώνει αστεράκια
 *
 * @author CF
 */
public class StarsStepApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;

        // Expressions
        System.out.println("Please insert start, end and step");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();

        i = start;
        while (i <= end) {
            System.out.print("* ");
            i += step;
        }
    }
}
