package gr.aueb.cf.ch6;

/**
 * Finds the min and max value in an array
 *
 * @author CF
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        int maxPosition = 0;
        int maxValue = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                minPosition = i;
                minValue = arr[minPosition];
            }

            if (arr[i] > arr[0]) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        System.out.printf("Min Position: %d", minPosition + 1);
        System.out.println();
        System.out.println("Min Value: " + minValue);
        System.out.printf("Max Position: %d", maxPosition + 1);
        System.out.println();
        System.out.println("Max Value: " + maxValue);
    }
}
