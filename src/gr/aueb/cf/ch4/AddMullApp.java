package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Προσθέτει και πολλαπλασιάζει n πρώτους ακέραιους
 * Το n το δίνει ο χρήστης
 *
 * @author CF
 */
public class AddMullApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a num (int)");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            result = result * i;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Mall = " + result);
    }
}
