package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγωντικό ενός αριθμού
 * που δίνει χρήστης
 *
 * @author Dimitris
 */
public class FactorialApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int inputNumber = 0;
        int i = 1;
        long facto = 1L;

        // Expressions
        System.out.println("Please insert number lower than or equal to 5");
        inputNumber = in.nextInt();
        while (i <= inputNumber) {
            facto *= i;
            i++;
        }

        System.out.printf("%d! = %d", inputNumber, facto);
    }
}
