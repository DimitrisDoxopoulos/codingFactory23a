package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου,
 * το άθροισμα των ψηφίων και το άθροισμα του πρώτου
 * και του τελευταίου ψηφίου
 *
 * @author CF
 */
public class DigitApp {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int rightmost = 0;
        int leftmost = 0;

        // Expressions
        System.out.println("Please insert a number");
        inputNum = in.nextInt();
        num = inputNum;

        do {
            count ++;
            currentDigit = num % 10;
            sum += currentDigit;

            if (count == 1) {
                rightmost = currentDigit;
            }

            num /= 10;
        } while (num != 0);

        leftmost = currentDigit;
        sumLeftRight = rightmost + leftmost;
        System.out.printf("Count of digits: %d\n" +
                "Sum of digits: %d\n" +
                "Sum of left and right digits: %d",
                count, sum, sumLeftRight);
    }
}
