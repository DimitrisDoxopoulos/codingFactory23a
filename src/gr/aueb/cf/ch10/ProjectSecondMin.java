package gr.aueb.cf.ch10;

/**
 * Finds the second min of an array of integers
 *
 * @author CF
 */
public class ProjectSecondMin {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 6, 8, 14, 9};
        int secondMinPos;

        secondMinPos = getSecondMinPosition(arr);

        if (secondMinPos == -1) {
            System.out.println("Error");
            System.exit(1);
        }

        System.out.printf("Position: %d, Value: %d", secondMinPos + 1, arr[secondMinPos]);
    }

    public static int getSecondMinPosition(int[] array) {
        int min = 0;
        int secondMin = 0;
        int minValue = 0;
        int secondMinValue = 0;

        if (array == null) return -1;
        if (array.length < 2) return -1;

        minValue = array[0];
        secondMinValue = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue && array[i] > secondMinValue) {
                secondMin = min;
                secondMinValue = minValue;
                min = i;
                minValue = array[i];
            } else if (array[i] > minValue && array[i] < secondMinValue) {
                secondMin = i;
                secondMinValue = array[i];
            }
        }

        return secondMin;
    }
}
