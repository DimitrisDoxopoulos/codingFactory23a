package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού επιλογών
 * μέχρι ο χρήστης να επιλέξει έξοδο
 *
 * @author CF
 */
public class MenuApp {
    public static void main(String[] args) {
        int i = 0;
        int result = 1;

        while (i < 3) {
            result = result * i;
            i++;
        }

        System.out.println(result);
    }
}
