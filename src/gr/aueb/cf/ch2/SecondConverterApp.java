package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts seconds to days, hours, minutes and
 * seconds
 *
 * @author CF
 */
public class SecondConverterApp {

    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        final int DAY_SECS = 24 * 3600;
        final int HOUR_SECS = 3600;
        final int MINUTES_SECS = 60;
        int inputSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int remainingSeconds = 0;

        // Expressions
        System.out.println("Please provide seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = inputSeconds / DAY_SECS;
        hours = inputSeconds / HOUR_SECS;
        minutes = inputSeconds / MINUTES_SECS;
        seconds = inputSeconds % MINUTES_SECS;

        // Print Result
        System.out.printf("%d seconds: %d Days, %d Hours, %d minutes, %d seconds",
                remainingSeconds, days, hours, minutes, seconds);
    }
}
