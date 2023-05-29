package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptApp {

    public static void main(String[] args) {
        /*
        int num1 = 5;
        int num2 = 0;
        int result;

        try {
            result = num1/num2;
        } catch(ArithmeticException ex) {
            ex.printStackTrace();
        }
         System.out.println(result);

         This case handles a runtime error but that has no meaning
         We have to handle the error, so it will not happen

         If we have input from a user, we could handle the arithmetic exception by
         using a try/catch but it is costly on resources

         The best way is to just try an if. See the code following
         */
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("The denominator is zero (0). Please handle");
        }
    }
}
