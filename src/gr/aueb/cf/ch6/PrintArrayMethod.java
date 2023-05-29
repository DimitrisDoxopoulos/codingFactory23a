package gr.aueb.cf.ch6;

/*
* Prints the elements of a table using a function
*/
public class PrintArrayMethod {
    public static void main(String[] args) {
        int[] ages = {15, 16, 17, 18,19, 20};
        printArray(ages, 1, 3);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        if ((arr == null) || low < 0 || high > arr.length - 1) return;
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
