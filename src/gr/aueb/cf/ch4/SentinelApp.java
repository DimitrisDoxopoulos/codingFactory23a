package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Keeps reading until a sentinel value is provided
 *
 * @author CF
 */
public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a number");
        num = in.nextInt();

        while (num != 0) {
            iterations++;
            System.out.println(num);
            System.out.println(iterations + " times printed. Please provide a number");
            num = in.nextInt();
        }
    }
}
