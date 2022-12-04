/*
This sort an array by repeatedly finding the minimum element from unsorted part
and putting it at the beginning
*/
package com.company.Day3;

public class SelectionSort {
    public static void sSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 8};
        sSort(arr);
    }
}