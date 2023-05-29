package gr.aueb.cf.ch6;

public class SwapClass {

    public static void main(String[] args) {
        int[] array = {1, 10};
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        swap(array);
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    public static void swap(int[] arr) {
        if (arr == null || arr.length > 2) return;
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}
