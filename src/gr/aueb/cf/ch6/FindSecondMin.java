package gr.aueb.cf.ch6;

/**
 * Finds the element that has the second smallest
 * value in an array
 *
 * @author DimitrisDoxopoulos
 */
public class FindSecondMin {

    public static void main(String[] args) {
        int[] array = {2, 5, 76, 44, 3, 4, 55,};
        int[] sortedArray = ascArray(array);

        if (sortedArray == null) {
            System.out.println("Your given array is null. Please provide an array");
        } else {
            System.out.println("The second smallest value of the array is " + sortedArray[1]);
        }
    }

    /**
     * Sorts the array's elements to ascending order
     *
     * @param array             int[], the given array
     * @return sortedArray      int[] the given array, sorted
     */
    public static int[] ascArray(int[] array) {
        // if the array is null, return null
        if (array == null) return null;

        int minPosition = 0;
        int minValue;
        int tmp;

        for (int i = 0; i < array.length - 1; i++) {
            minPosition = i;
            minValue = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minPosition = j;
                }
            }

            tmp = array[i];
            array[i] = minValue;
            array[minPosition] = tmp;
        }

        return array;
    }
}
