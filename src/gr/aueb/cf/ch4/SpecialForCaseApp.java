package gr.aueb.cf.ch4;

import java.sql.SQLOutput;

/**
 * For Loop Forever
 *
 * @author CF
 */
public class SpecialForCaseApp {

    public static void main(String[] args) {
        int counter = 0;
        for (; ; ) {
            counter++;
            System.out.print("Forever ");
            if (counter % 20 == 0) System.out.println();
            if (counter == 100) break;
        }
    }
}
