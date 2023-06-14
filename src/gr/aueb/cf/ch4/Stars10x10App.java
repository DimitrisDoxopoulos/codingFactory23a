package gr.aueb.cf.ch4;

/**
 * prints 10 stars horizontally and vertically
 *
 * @author CF
 */
public class Stars10x10App {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
