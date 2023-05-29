package gr.aueb.cf.ch6;

/**
 * Finds the position of the element with the max
 * value inside an array
 *
 * @author DimitrisDoxopoulos
 */
public class GetMaxPositionApp {

    public static void main(String[] args) {
        int[] array = {1, 2, 9, 3, 4, 5, 6};
        int maxPosition = getMaxPosition(array, 0, array.length);
        System.out.printf("The position of the max value element is %d and its value is %d",
                maxPosition, array[maxPosition]);
    }

    /**
     * Returns the position of the element that has the max
     * value of the given array.
     * We can also specify position limits for our search
     *
     * If the given array is null, then we just return -1
     *
     * @param arr       int[] the given array
     * @param low       int min position limit
     * @param high      int max position limit
     * @return          int the position of the max value element
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        // If the given array is null or high < low, we do not need to run any more code
        if ((arr == null) || high < low) return -1;
        int maxPosition = -1;
        int maxValue = arr[0];

        for (int i = low; i < high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        return maxPosition;
    }
}
