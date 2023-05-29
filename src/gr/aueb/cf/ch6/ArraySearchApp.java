package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int SECRET = 9;
        int[] array = {1, 5, 9, 3, 12};
        boolean secretIsFound = false;

        for (int item : array) {
            if (item == SECRET) {
                secretIsFound = true;
                break;
            }
        }

        if (secretIsFound) {
            System.out.println("Secret is found");
        } else {
            System.out.println("Secret is not found");
        }
    }
}
