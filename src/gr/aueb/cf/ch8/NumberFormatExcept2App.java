package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * By checking for errors before the error happens, we can handle it
 * efficiently
 *
 * We use the isInt function to check if we have an int
 *
 * @author CF
 */
public class NumberFormatExcept2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = "";
        int inputNum;

        System.out.println("Please insert an int");
        inputStr = in.nextLine();

        // Check if we have an int input
        if (isInt(inputStr)) {
            inputNum = Integer.parseInt(inputStr);
            System.out.println("Input num: " + inputNum);
        } else {
            System.out.println("Error in input");
        }
    }

    /**
     * Checks if a string is actually a number, so it can
     * be typecast into a string
     *
     * @param s     input string
     * @return      boolean, true if s is int or else false
     */
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }
}
