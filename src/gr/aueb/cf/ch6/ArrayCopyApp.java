package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayCopyApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        firstWay(arr);
        System.out.println();
        secondWay(arr);
        System.out.println();
        thirdWay(arr);
    }

    public static void firstWay(int[] arr) {
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        for (int item : arr1) {
            System.out.print(item + " ");
        }
    }

    public static void secondWay(int[] arr) {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        for (int item : arr2) {
            System.out.print(item + " ");
        }
    }

    public static void thirdWay(int[] arr) {
        int[] arr3 = Arrays.copyOfRange(arr, 0, arr.length);
        for (int item : arr3) {
            System.out.print(item + " ");
        }
    }
}
