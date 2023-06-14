package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner reads input from the user
 * and uses them to our program
 *
 * @author Dimitris
 */
public class ScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert two numbers");

        // nextInt will ignore everything except from integers
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
}
