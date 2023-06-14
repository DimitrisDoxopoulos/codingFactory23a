package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Almost same with InputMismatchExceptApp but without try/catch
 * Reminding that try/catch is heavy on memory, so we find other
 * ways to handle our errors
 *
 * @author CF
 */
public class InputMismatchExcept2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {
            System.out.println("Please insert a num and find the magic number");

            if (in.hasNextInt()) {
                inputNum = in.nextInt();
            } else {
                in.nextLine();
                System.out.println("Error: Are you sure you entered a number?");
                continue;
            }

            if (inputNum == MAGIC_NUM) {
                System.out.println("Great!");
                break;
            } else {
                System.out.println("Try again!");
            }

        }

        System.out.println("Thanks for using the Magic App");
    }
}
