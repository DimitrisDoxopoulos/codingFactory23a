package gr.aueb.cf.ch2;

import java.awt.desktop.AppReopenedEvent;
import java.util.Scanner;

/**
 * Converts Euros to Dollars (USA).
 * Accepts an integer from the user which
 * is the amount in Euros, converts it to
 * dollars and prints the result
 *
 * @author CF
 */
public class EuroToUsdConverterApp {

    public static void main(String[] args) {
        // Variables
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        // Expressions
        System.out.println("Please give the amount you want to convert:");
        Scanner in = new Scanner(System.in);
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = usaDollars % 100;


        // Print the result
        System.out.printf("Τα %d ευρώ είναι %d δολάρια και %d cents.",
                inputEuros, usaDollars, usaCents);
    }
}
