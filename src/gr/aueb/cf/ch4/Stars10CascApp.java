package gr.aueb.cf.ch4;

/**
 * Prints 10 stars but cascading from 1 to 10
 *
 * @author CF
 */
public class Stars10CascApp {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
