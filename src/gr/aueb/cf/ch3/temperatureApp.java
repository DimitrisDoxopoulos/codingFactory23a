package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if it will snow according to
 * the temperature. If temp < 0, then
 * it is snowing. The user can insert
 * the temperature
 *
 * @author CF
 */
public class temperatureApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        // Expressions
        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
