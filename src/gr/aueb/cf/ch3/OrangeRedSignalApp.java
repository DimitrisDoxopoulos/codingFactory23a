package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει δυο δεξαμενές. Αν η μια δεξαμενή
 * έχει 1/4 καύσιμα τότε ανάβει πορτοκαλί σήμα.
 * Αν και οι δυο δεξαμενές έχουν μικρότερο από 1/4
 * τότε δίνει κόκκινο σήμα.
 * Ο χρήστης δίνει αν κάποια δεξαμενή έχει λιγότερο από
 * 1/4 καύσημα (true/false)
 *
 * @author CF
 */
public class OrangeRedSignalApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        boolean isTank1Low = false;
        boolean isTank2Low = false;
        boolean orangeOn = false;
        boolean redOn = false;

        // Expressions
        System.out.println("Please insert if tank 1, tank 2 are low");
        isTank1Low = in.nextBoolean();
        isTank2Low = in.nextBoolean();

        orangeOn = isTank1Low || isTank2Low;
        redOn = isTank1Low && isTank2Low;

        // Print result
        System.out.printf("Orange light on: %b\nRed light on: %b",
                orangeOn, redOn);
    }
}
