package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates square and cube of a number the user inputs
 * Math.pow of Math class is used
 *
 * @author CF
 */
public class MathPowersApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int inputNumber = 0;

        // Expressions
        System.out.println("Provide a number");
        inputNumber = in.nextInt();

        // Print Result
        System.out.printf("The cube of %d is %d and its square is %d",
                inputNumber, (int)Math.pow(inputNumber, 3), (int)Math.pow(inputNumber, 2));
    }
}
