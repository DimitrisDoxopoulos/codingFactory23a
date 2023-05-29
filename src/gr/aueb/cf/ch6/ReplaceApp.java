package gr.aueb.cf.ch6;

public class ReplaceApp {

    public static void main(String[] args) {
        final int NEWVALUE = 56;
        int[] arr = {1, 2, 6, 9, 15};

        replace(arr, 6, NEWVALUE);
        int positionOfNewValue = getIndex(arr, NEWVALUE);

        System.out.printf("Position %d; Value %d", positionOfNewValue + 1, arr[positionOfNewValue]);
    }

    /**
     * Replaces
     *
     * @param arr
     * @param oldVal
     * @param newVal
     */
    public static void replace(int[] arr, int oldVal, int newVal) {
        int positionToReplace = -1;
        if (arr == null) return;

        positionToReplace = getIndex(arr, oldVal);
        if (positionToReplace == -1) return;
        arr[positionToReplace] = newVal;
    }

    public static int getIndex(int[] arr, int value) {
        if (arr == null) return -1;
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                position = i;
                break;
            }
        }

        return position;
    }
}
