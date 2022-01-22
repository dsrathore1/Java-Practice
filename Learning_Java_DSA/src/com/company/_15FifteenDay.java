package com.company;

public class _15FifteenDay {
    public static void main(String[] args) {
        // Insertion Sort
        int[] a = {9, 3, 5, 7, 1};
        int temp, i, j;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            j = i;
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}

class FindMinMax {
    // Find the min and max into the given array
    int[] arr = {2, 5, 6, 8, 12, 87, 1};

}