package gr.aueb.cf.ch2;

/**
 * Example of expressions containing numbers
 *
 * @author Dimitris
 */
public class ExpressionsTab {
    public static void main(String[] args) {
        // Setting Variables
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        // Expressions
        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        result1 = num1++; // result2 -> 12, num1 -> 13
        result2 = ++num2; // num2 -> 6, result2 -> 6

        // Print the result on the standard output
        System.out.printf("SUM: %d, SUB: %d, MUL: %d, DIV: %div, MOD: %d\n",
                sum, sub, mul, div, mod);

        System.out.printf("Num1: %d, Result1: %d, Num2: %d Result2: %d",
                num1, result1, num2, result2);
    }
}
