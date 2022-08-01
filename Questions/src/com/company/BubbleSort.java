package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 87, 23, 12,5};
        bubbleSorting(arr);
    }

    public static void bubbleSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int m : arr) {
            System.out.print(m + " ");
        }
    }
}
