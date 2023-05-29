package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 */
public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("c:/javatmp/cf.txt");

        // Prints in the cf.txt file
        printMessage(ps, "Hello World");

        // Prints in the console
        printMessage(System.out, "Hello Coding Factory");
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
