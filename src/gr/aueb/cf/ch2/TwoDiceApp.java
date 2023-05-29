package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Casts two dice
 *΄
 * @author CF
 */
public class TwoDiceApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int numberOfDice = 0;
        int sides = 0;
        int die1 = 0;
//        int die2 = 0;

        System.out.println("How many dice?");
        numberOfDice = in.nextInt();
        System.out.println("Insert sides");
        sides = in.nextInt();
        for (int i = 1; i <= numberOfDice; i++) {
            System.out.printf("die %d: %d\n", i, (int) (Math.random() * sides) + 1);
        }

        die1 = (int) (Math.random() * sides) + 1;
//        die2 = (int) (Math.random() * sides) + 1;

//        System.out.printf("die1: %d, die2: %d", die1, die2);
    }
}
