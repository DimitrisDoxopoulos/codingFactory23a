package gr.aueb.cf.ch6;

/**
 * Αρχικοποίηση και δήλωση στοιχείων σε πίνακα
 *
 * @author CF
 */
public class PopulateArray {
    public static void main(String[] args) {
        // Δήλωση αρχικοποίησης πίνακα με μέγεθος
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        // Without using size
        int[] arr2 = {1, 5, 8, 9,12};

        // Array initializer
        int[] arr3;
        arr3 = new int[] {4, 6, 9, 10};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // Enhanced for for arrays
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
