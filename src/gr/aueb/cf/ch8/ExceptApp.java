package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Demonstrates the usage of exceptions
 *
 * When an error is thrown, we either have to write either on the
 * function title that it throws an exception (trows IOException)
 * or we have to handle it by using try catch
 *
 * Reminding that .read() throws checked exceptions so they either have
 * to be thrown on from the function or handled
 *
 * @author CF
 */
public class ExceptApp {

    public static void main(String[] args) {
        int ch;
        int[] arr = new int[10];

        try {
            ch = getNextChar();
            System.out.println(ch);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i <= arr.length; i++) {
            // Runtime Exception Out of bound: It cannot and must not be handled
            // Must be fixed
            System.out.print(arr[i] + " ");
        }
    }

    public static int getNextChar() throws IOException {
        int ch = ' ';

        try {
            ch = System.in.read();
        } catch (IOException ex) {
            // 1. Rollback
            // 2. Logging
            ex.printStackTrace();

            // 3. Rethrow exception
            throw ex;
        }
        return ch;
    }
}
