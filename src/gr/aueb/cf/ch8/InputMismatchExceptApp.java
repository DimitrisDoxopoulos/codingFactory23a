package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;
        while (true) {
            try {
                System.out.println("Please insert a num and find the magic number");

                inputNum = in.nextInt();

                if (inputNum == MAGIC_NUM) {
                    System.out.println("Great!");
                    break;
                } else {
                    System.out.println("Try again!");
                }
            } catch (InputMismatchException ex) {
                in.nextLine();
                System.out.println("Error: Are you sure you entered a number?");
            }

        }

        System.out.println("Thanks for using the Magic App");
    }
}
