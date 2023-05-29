package gr.aueb.cf.ch5;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Checks equality on floating points
 *
 * @author CF
 */
public class DoubleCompareApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = 0.9;
        double num2 = 0.0;
        final double EPSILON = 0.005;

        System.out.println("Please give two numbers to compare");
        num1 = in.nextDouble();
        num2 = in.nextDouble();

        if (Math.abs(num2 - num1) <= EPSILON) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
