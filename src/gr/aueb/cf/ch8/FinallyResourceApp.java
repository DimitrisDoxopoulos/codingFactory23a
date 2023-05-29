package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * When main function finishes executing, it closes
 * the Scanner. In bigger programs, we have to close it
 * by ourselves
 *
 * In case of an exception, it has to be closed on the
 * catch part, too
 *
 * Finally will get executed, error or not. Its primary usage
 * is to close every resource we have opened
 *
 * Finally can also produce exceptions, so we have to specify
 * a try/catch there also
 * @author CF
 */
public class FinallyResourceApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        try {
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
