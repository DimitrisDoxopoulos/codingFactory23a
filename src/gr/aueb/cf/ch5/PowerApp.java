package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates a ^ n
 *
 * @author CF
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int n;
        int result;

        System.out.println("Please insert base first and then power");
        a = in.nextInt();
        n = in.nextInt();

        result = power(a, n);
        System.out.printf("%d ^ %d = %d", a, n, result);
    }

    /**
     * Calculates a^n
     *
     * @param a     the base to be raised
     * @param n     the power to raise
     * @return      int result
     */
    public static int power(int a, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= a;
        }

        return power;
    }
}
