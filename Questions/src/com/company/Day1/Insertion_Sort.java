package com.company.Day1;

public class Insertion_Sort {
    public static void iSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        System.out.print("\nYour sorted array is :- ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 9, 6, 7, 1, 54};
        iSort(arr);
    }
}
