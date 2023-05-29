package gr.aueb.cf.ch4;

/**
 * Prints 10, 9, 8, ... , 1 stars
 *
 * @author CF
 */
public class Stars10DiscApp {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
