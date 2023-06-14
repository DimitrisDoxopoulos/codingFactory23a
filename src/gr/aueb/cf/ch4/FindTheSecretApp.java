package gr.aueb.cf.ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * The user has 10 chances to find a secret key
 * If the key is find earlier than the 10th try,
 * for must stop (break)
 *
 * @author CF
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Please make a guess");
            num = in.nextInt();
            if (num == SECRET_KEY) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No worries Play again!");
            System.exit(1);
        }
        System.out.println("Found the secret! it is " + SECRET_KEY);
    }
}
