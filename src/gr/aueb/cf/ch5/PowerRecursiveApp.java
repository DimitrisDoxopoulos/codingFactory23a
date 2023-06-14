package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates a^n recursively
 *
 * @author CF
 */
public class PowerRecursiveApp {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        float base = nextInt("Please insert base");
        float power = nextInt("Please insert power");
        float result = recPower(base, power);

        System.out.printf("%.2f ^ %.2f = %.2f", base, power, result);
    }

    public static int nextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    public static float recPower(float a, float n) {
        if (n == 0) {
            return 1;
        }

        if (n > 0) {
            return a * recPower(a, n - 1);
        } else
            return 1 / recPower(a, -n);
    }
}
