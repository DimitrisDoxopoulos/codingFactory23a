package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if the car's lights must be
 * turned on according to if it's raining,
 * and if it's dark or we are speeding up.
 * The above information we receive from the
 * user.
 *
 * @author CF
 */
public class LightOnApp {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        boolean lightsOn = false;
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        int speed = 0;

        // Expressions
        System.out.println("Is it raining? (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Is it dark? (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert the speed (int)");
        speed = in.nextInt();

        isRunning = speed > 100;
        lightsOn = isRaining && (isDark || isRunning);

        // Print
        System.out.println("Lights on: " + lightsOn);
    }
}
