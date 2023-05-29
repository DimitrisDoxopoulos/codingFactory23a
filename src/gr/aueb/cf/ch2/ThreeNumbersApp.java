package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Prints three numbers which are read from the user,
 * reduces them by 1 and then printing them and
 * leaving spaces between them
 */
public class ThreeNumbersApp {

    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        // Expressions
        System.out.println("Please provide three numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        num1 --;
        num2 --;
        num3 --;

        // Print the result
        System.out.printf("%d %d %d", num1, num2, num3);
    }
}
