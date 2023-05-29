package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Uses recursion to calculate the facto of n
 *
 * @author CF
 */
public class FactorialRecursiveApp {

    // Global Variables
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int number = nextInt("Please give a number");
        System.out.printf("%d! = %d", number, facto(number));
    }

    /**
     * Ask the user for a number
     *
     * @author CF
     */
    public static int nextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    /**
     * Calculates the facto recursively
     *
     * @param n     int, the number
     * @return      int, the facto of the number
     *
     * @author CF
     */
    public static int facto(int n) {
        return (n <= 1) ? 1 : n * facto(n - 1);
    }
}
