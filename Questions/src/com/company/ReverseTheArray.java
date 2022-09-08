package com.company;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3, 4, 7, 6};
        method1(arr1);

        System.out.println(" ");
        int[] arr = {3, 5, 3, 6, 7, 8, 45, 34};
        int n = arr.length - 1;

        method2(arr, 0, n);
        printArray(arr);
    }

    public static void method1(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;

            //! Optimize way
            temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void method2(int[] arr, int l, int r) {
        if (l < r) {
            int temp;
            //! Swapping
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            method2(arr, l + 1, r - 1);
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
