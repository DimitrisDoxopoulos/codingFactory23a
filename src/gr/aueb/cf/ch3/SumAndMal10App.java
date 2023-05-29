package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο
 * των 10 πρώτων ακεραίων (1-10)
 *
 * @author CF
 */
public class SumAndMal10App {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int mulResult = 1;

        while (i <= 10) {
            sum += i;
            mulResult *= i;
            i++;
        }

        System.out.printf("sum = %d\nmul = %d", sum, mulResult);
    }
}
