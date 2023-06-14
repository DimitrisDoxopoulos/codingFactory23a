package gr.aueb.cf.ch1;

/**
 * Adds two numbers and prints the result
 * on standard output
 *
 * @author Dimitris
 */
public class AddApp {
    public static void main(String[] args) {

        // Give  your variables
        int num1 = 10;
        int num2 = 2;
        int result;

        // Write your functions
        result = num1 + num2;

        // Print your result for the user
        System.out.printf("The sum of the numbers %d and %d are %d", num1, num2, result);
        /*
            printf: f means formatted
            %d: placeholder that expects to be fed with a number and print it
         */
    }
}
