package gr.aueb.cf.ch6;

/**
 * Στο shallow copy αντιγράφουμε περιοχή μνήμης.
 * Αν στο παρακάτω παράδειγμα κάνουμε αντιγραφή του
 * arr1 στο arr2 και  αλλάξουμε ένα στοιχείο του arr2,
 * τότε η αλλαγη θα περάσει και στο arr1 επειδή μειράζονται
 * την ίδια περιοχή στη μνήμη
 *
 * Για την αποφυγή αυτού, πρέπει να φτιάξουμε το arr2 ως καινούργιο
 * array, έτσι ώστε να δεσμευτεί ανεξάρτητος χώρος μνήμης για αυτό και
 * να αντιγράψουμε τα στοιχεία του arr1 στο arr2
 *
 * @author CF
 */
public class ShallowCopyApp {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2;
        int[] arr3 = new int[arr1.length];

        // Αντιγραφή Αναφορών
//        arr1 = arr2;
        for (int item : arr3) {
            System.out.print(item + " ");
        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        System.out.println();
        for (int item : arr3) {
            System.out.print(item + " ");
        }


    }
}
