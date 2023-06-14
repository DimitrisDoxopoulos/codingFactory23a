package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Using so many try/catch as in FinallyResourceApp,
 * ends up in code being written all over. That makes
 * the code more difficult to read and debug
 *
 * Java provides a form of try to use with the auto
 * closable resources
 *
 * Scanner is auto closable
 *
 * @author CF
 */
public class TryWithResourcesApp {

    public static void main(String[] args) {
        int num;

        try (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        /*
            From java 9, we can specify the Scanner outside from the try ().
            so it would look like this;

            Scanner in = new Scanner(System.in);

            try (in)...

            Provided that the variable that is put in () will be final or effectively final
            That means, inside the try block, its value does not change
         */
    }
}
