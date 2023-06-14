package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Calculates a^n using BigInteger
 *
 * @author CF
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = BigInteger.ZERO;
        BigInteger n = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please provide base, power but make them big");
        a = BigInteger.valueOf(in.nextInt());
        n = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= n.intValue(); i++) {
            result = result.multiply(a);
        }

        System.out.printf("%d ^ %d = %d", a, n, result);
    }
}
