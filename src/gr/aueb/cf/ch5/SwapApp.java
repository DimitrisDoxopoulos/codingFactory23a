package gr.aueb.cf.ch5;

/**
 * Exchanges values on two variables
 *
 * @author CF
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("Before swap: a = %d, b = %d", a, b);
        System.out.println();
        swap(a, b);
        System.out.printf("After swap: a = %d, b = %d", a, b);
    }

    /**
     * Swaps the value of a and b
     * a = b, b = a
     * @param a     int, the first value
     * @param b     int, the second value
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
