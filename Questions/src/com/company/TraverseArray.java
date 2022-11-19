package com.company;

public class TraverseArray {
    public static void traverseArray(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        traverseArray(arr, i + 1);
    }

    public static void traverseReverseArray(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        traverseReverseArray(arr, i + 1);
        System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {46, 22, 34, 76, 75, 2, 1, 6, 90};
        traverseArray(arr, 0);
        System.out.println("\nReversed Array");
        traverseReverseArray(arr, 0);
    }
}
