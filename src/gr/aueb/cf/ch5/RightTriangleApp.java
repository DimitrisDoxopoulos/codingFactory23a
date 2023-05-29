package gr.aueb.cf.ch5;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * User inserts three values and they are compared
 * so the user knows if the triangle they make is
 * a right one
 *
 * the checking is done using the theorem a^2 = b^2 + c^2
 *
 * @author CF
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double result = 0.0;
        final double EPSILON = 0.00005;

        System.out.println("Δώστε υποτείνουσα και στη συνέχεια τις άλλες δυο γωνίες");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        result = Math.pow(a, 2) - (Math.pow(b, 2) + Math.pow(c, 2));

        if (Math.abs(result) <= EPSILON) {
            System.out.println("Right triangle");
        } else {
            System.out.println("not right");
        }
    }
}
