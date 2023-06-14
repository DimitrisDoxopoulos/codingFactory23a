package gr.aueb.cf.ch6;

/**
 * From a n + 1 group of numbers,
 * fit the first n in an array and
 * find which one is missing
 *
 * @author CF
 */
public class FindMissingApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int missing = 0;

        missing = findMissing(arr);
        System.out.println(missing);
    }

    public static int findMissing(int[] arr) {
        int[] temp = new int[arr.length];
        int missing = 0;

        for (int i = 0; i < temp.length - 1; i++) {
            temp[i]++;
        }

        for (int item : arr) {
            for (int itemInTempArray : temp) {
                if (item == itemInTempArray) continue;
            }
            missing = item;
        }

        return missing;
    }
}
