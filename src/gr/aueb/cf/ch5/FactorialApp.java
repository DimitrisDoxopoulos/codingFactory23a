package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates n! by using the method facto
 *
 * n is input by the user
 *
 * @author CF
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int result;

        System.out.println("Insert a number to calculate its factorial");
        n = in.nextInt();

        result = FactorialApp.facto(n);
        System.out.printf("%d! = %d", n, result);
    }

    /**
     * Calculates the factorial of n
     *
     * @param n
     * @return int
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
