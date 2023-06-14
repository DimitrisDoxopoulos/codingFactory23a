package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * The user inputs three numbers and we find
 * the greatest one
 *
 * @author CF
 */
public class MaxOfThreeApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        // expressions
        System.out.println("Please insert three numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        // Print
        System.out.printf("The max number between %d, %d and %d is %d",
                num1, num2, num3, Math.max(num1, Math.max(num2, num3)));
    }
}
