package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Prints as many stars as the user decides
 *
 * @author CF
 */
public class StarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 0;

        System.out.println("Please insert number of stars");
        numberOfStars = in.nextInt();

        while (i < numberOfStars) {
            System.out.print("* ");
            i++;
        }
    }
}
