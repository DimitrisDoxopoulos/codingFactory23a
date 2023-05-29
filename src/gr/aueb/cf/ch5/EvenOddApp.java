package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Decides if input number is even or odd
 *
 * @author CF
 */
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.println("Please insert a number");
        number = in.nextInt();

        System.out.printf("the number %d is even. %b", number, isEven(number));
    }

    /**
     * Checks if the number we input is even
     * Returns true if the number is even
     * False otherwise
     *
     * @param number
     * @return boolean
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
