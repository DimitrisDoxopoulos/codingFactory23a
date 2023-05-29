package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * The user inputs two digits and the program returns
 * their sum
 *
 * @author CF
 */
public class IntTwoDigitsApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumDigit = 0;

        // Expressions
        System.out.println("Please insert two digit number");
        num = in.nextInt();
        leftDigit = num / 10;
        rightDigit = num % 10;
        sumDigit = leftDigit + rightDigit;

        // Print
        System.out.printf("The sum of the digits of %d is %d",
                num, sumDigit);
    }
}
