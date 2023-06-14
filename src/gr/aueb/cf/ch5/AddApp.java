package gr.aueb.cf.ch5;

/**
 * Προσθέτει δυο ακεραίους με τη μέθοδο add
 *
 * @author CF
 */
public class AddApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        
        sum = add(num1, num2);
        System.out.println(sum);
    }

    public static int add(int a, int b) {
//        int sum = 0;
//        sum = a + b;
//        return sum;

        // shorter way
        return a + b;
    }
}
