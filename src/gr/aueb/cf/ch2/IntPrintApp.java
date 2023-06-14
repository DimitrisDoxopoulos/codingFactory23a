package gr.aueb.cf.ch2;

/**
 * Ways to print an output including an integer
 */
public class IntPrintApp {
    public static void main(String[] args) {
        int i = 12_324;

//        System.out.println("Using println and concatenation: " + i);
//        System.out.print("Using print and concatenation: " + i + "\n");
//        System.out.printf("Using printf and a placeholder: %d\n", i);

        System.out.printf("trying to see how to change the thousands: %,d", i);
    }
}
