package gr.aueb.cf.ch5;

/**
 * Method overloading
 *
 * The methods here might have the same name
 * but the code realizes which one to use because
 * of the variables
 *
 * The signature of a variable is determined by its
 * name and its inputs
 *
 * @author CF
 */
public class OverloadingApp {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1L, 2));
        System.out.println(add(1L, 2L));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static long add(long num1, int num2) {
        return num1 + num2;
    }

    public static long add(long num1, long num2) {
        return num1 + num2;
    }
}
