package gr.aueb.cf.ch6;

/**
 * Searches for an element in an array
 *
 * @author CF
 */
public class SecretKeyWithMethod {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int value = 6;
        int position;

        position = getElementPosition(array, value);
        System.out.println(position);
    }

    /**
     * Searches for the element of a table
     * If the element is not found, returns -1
     *
     * @param arr       input array
     * @param value     value we are searching
     * @return
     */
    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1;
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                position = i;
            }
        }
        return position;
    }
}
