package gr.aueb.cf.ch2;

/**
 * Overflow
 *
 * When you exceed the max value of a dat type
 *
 * @author Dimitris
 */
public class AddApp {

    public static void main(String[] args) {
        int num1 = 2_147_483_647; // max value for integer
        int num2 = 2;
        int result = 0;

        result = num1 + num2;

        System.out.printf("Result: %d. The result is wrong because we exceed the maximin" +
                "capacity of the int data type", result);
    }
}
