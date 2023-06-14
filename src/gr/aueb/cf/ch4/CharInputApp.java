package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Διαβάζει έναν char με τη System.in.read()
 *
 * @auth CF
 */
public class CharInputApp {

    public static void main(String[] args) throws IOException {
        char inputChar = ' ';
        Scanner in = new Scanner(System.in);

        // Read the char from the user
        System.out.println("Please insert an ASCII char");
        inputChar = (char) System.in.read();

        System.out.printf("The character you input is %c:", inputChar);
    }
}
