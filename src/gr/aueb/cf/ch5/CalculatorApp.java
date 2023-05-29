package gr.aueb.cf.ch5;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/**
 * Make a simple calculator that lets the user do
 * adds, subs, divs and mods
 *
 * Generates a menu with choices for the user
 * Takes the user's choice and then the value of two numbers
 *
 * In the end it shows the result to the user
 *
 * @author CF
 */
public class CalculatorApp {

    // Declaring the Scanner instance outside main, we can use it in all the classes
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result = 0;

        while (true) {
            // Print the menu
            printMenu();

            // Get int with the user's choice
            choice = getNextInt("Please make a choice");

            // If choice is invalid, then give a warning to the user
            if (isValid(choice)) {
                System.out.println("Invalid choice. Please choose from 1 to 6");
                continue;
            }

            // If the user chooses to exit, then exit the program
            if (isChoiceQuit(choice)) {
                System.out.println("Thak you for using ouc calculator");
                break;
            }

            // On choice, get result
            System.out.println("Result: " + onChoiceGetResults(choice));
        }
    }

    /**
     * Prints the menu for the user
     */
    public static void printMenu() {
//        System.out.println("Please make a choice");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Mod");
        System.out.println("6. Exit");
    }

    /**
     * Asks the user for his choice
     *
     * @param message   input string
     * @return          output choice string
     */
    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    /**
     * Checks if user's choice is invalid
     *
     * @param choice        int input from user
     * @return boolean      warning of invalid choice
     */
    public static boolean isValid(int choice) {
        return choice < 1 || choice > 6 ;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return (num2 == 0) ? Integer.MAX_VALUE : num1 / num2;
//        int value = 0;
//        if (num2 == 0) {
//            value =  Integer.MAX_VALUE;
//        } else {
//            value = num1 / num2;
//        }
//        return value;
    }

    public static int mod(int num1, int num2) {
        return (num2 == 0) ? Integer.MAX_VALUE : num1 % num2;
//        int value = 0;
//        if (num2 == 0) {
//            value =  Integer.MAX_VALUE;
//        } else {
//            value = num1 % num2;
//        }
//        return value;
    }

    public static int onChoiceGetResults(int choice) {
        int num1 = getNextInt("Please insert the first number");
        int num2 = getNextInt("Please insert the second number");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;

        }
        return result;
    }
}
