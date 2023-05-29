package gr.aueb.cf.ch6;

/**
 * Λαμβάνει ως είσοδο δεδομένων έναν πίνακα βαθμολογιών
 * (ακεραίων από 0 έως 100) και εμφανίζει κατανομή
 * των βαθμών σε ένα chart.
 *
 * @author CF
 */
public class GradesDistributionApp {

    public static void main(String[] args) {
        int[] grades = {30, 9, 12, 22, 28, 29, 21, 34, 44, 46, 47, 48, 49, 55, 67, 69, 89, 90, 95, 100};
        int[] count = new int[10];

        for (int grade : grades) {
            if (grade == 100) {
                count[9] += 1;
            } else {
                count[grade / 10] += 1;
            }
        }

        for (int i = 0; i < count.length; i++) {
            int first = i * 10;
            int second = (i != 9) ? (i * 10 + 9) : (i * 10 + 10);
            System.out.printf("%02d - %02d ", first, second);
            for (int j = 1; j <= count[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
