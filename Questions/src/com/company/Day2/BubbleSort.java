//! It works by repeatedly swapping the adjacent elements if they are in the wrong order
package com.company.Day2;

public class BubbleSort {
    public static void bSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //* Swap it!!
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //* Print array
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {33, 53, 56, 98, 76, 23, 100};
        bSort(arr);
    }
}
