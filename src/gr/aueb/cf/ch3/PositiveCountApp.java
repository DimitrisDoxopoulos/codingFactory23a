package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών αριθμών που
 * μας δίνει ο χρήστης
 *
 * @author CF
 */
public class PositiveCountApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        System.out.println("Please give a number (int)");
        num = in.nextInt();

        while (num >= 0) {
            positiveCount++;
            System.out.println("Please give a number (int)");
            num = in.nextInt();
        }

        System.out.print("Positive count: " + positiveCount);
    }
}
