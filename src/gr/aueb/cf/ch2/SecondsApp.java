package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει ώρες λεπτά και δευτερόλεπτα και
 * επιστρέφει στο χρήστη δευτερόλεπτα
 *
 * @author CF
 */
public class SecondsApp {
    public static void main(String[] args) {
        // Variables
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int resultSeconds = 0;
        final int SECONDS_PER_HOUR = 360;
        final int SECONDS_PER_MINUTE = 60;

        // Expressions
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide hours, minutes and seconds");
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        resultSeconds = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputSeconds;

        // Print Result
        System.out.printf("%d Hours, %d Minutes and %d minutes in Seconds: %d",
                inputHours, inputMinutes, inputSeconds, resultSeconds);
    }
}
