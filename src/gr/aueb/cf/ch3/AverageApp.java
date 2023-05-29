package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το μέσο όρο της βαθμολογίας ενός μαθητή.
 * Παρέχονται τα total και count
 *
 * @author CF
 */
public class AverageApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int average = 0;
        final int PERFECT_SCORE = 10;

        System.out.println("Please provide total and count");
        total = in.nextInt();
        count = in.nextInt();

        if (count == 0) {
            System.out.println("Invalid Count");
            System.exit(1);
        }

        if (total < 0) {
            System.out.println("Invalid Total");
            System.exit(1);
        }

        average = total / count;

        if (average > PERFECT_SCORE) {
            System.out.println("Invalid average");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Exelent");
        } else if (average >= 7) {
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else if (average < 5) {
            System.out.println("Not passed yet");
        }
    }
}
