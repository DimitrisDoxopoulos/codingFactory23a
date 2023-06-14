package gr.aueb.cf.ch8;

/**
 * In getMinPosition we return a value if array = null
 * Using that way, we can then check on main if we get -1
 * as a result on the minPosition, so we can warn the user
 *
 * @author CF
 */
public class CommonErrorCases {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int minPosition;

        minPosition = getMinPosition(arr);
        if (minPosition == -1) {
            System.out.println("Invalid Array");
        } else {
            System.out.println(minPosition);
        }
    }

    /**
     * Finds the position of the minimum array element
     *
     * @param arr       int[] the array to find its minimum element
     * @return          int   the position of the minimum element
     */
    public static int getMinPosition(int[] arr) {
        if (arr == null) return -1; // common error case

        int minPosition = 0;
        int minValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }

    /**
     * We return null in case of a common error or if str is not found inside
     * strArr
     *
     * Returning null is error-prone, because programmers without experience might
     * overlook it
     *
     * Although it is not recommended from the Java documentation, the Java community
     * keeps using this method, but we always have to be careful with it
     *
     * @param strArr        String[]    array of strings
     * @param str           String     to check if it appears in the String[]
     * @return              null in case of errors
     */
    public static String getStringOnNull(String[] strArr, String str) {
        if (strArr == null || str == null) return null; // common error case
        String strToReturn = null;

        for (String s : strArr) {
            strToReturn = s;
        }

        return strToReturn;
    }
}
