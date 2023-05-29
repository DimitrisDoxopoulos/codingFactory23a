package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * If the user inputs a String instead of an int, there will be a
 * NumberFormatException. We have to handle it before it happens
 *
 * @author CF
 */
public class NumberFormatExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = "";
        int inputNum;

        try {
            System.out.println("Please insert an int");
            inputStr = in.nextLine();
            inputNum = Integer.parseInt(inputStr);
            System.out.println("Input num: " + inputNum);
        } catch (NumberFormatException ex) {
//            ex.printStackTrace();
            System.out.println("Error in input");
        }

    }
}
