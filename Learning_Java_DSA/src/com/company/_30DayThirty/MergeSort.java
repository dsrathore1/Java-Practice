package com.company._30DayThirty;

//! Time complexity of the Merge sort is O(nlog(n))

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 33, 4, 5, 19, 8, 79, 1, 6};
        int n = arr.length;

        divide(arr, 0, n - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

    }

    //* Dividing the given array
    //* Time complexity :- O(log(n))
    public static void divide(int[] arr, int start, int end) {

        //! Base Case
        if (start >= end) {
            return;
        }
        //! Find the mid element
        int mid = start + (end - start) / 2;

        //! First half of the array
        divide(arr, start, mid);
        //! Second half of the array
        divide(arr, mid + 1, end);

        //! Merge the array
        conquer(arr, start, mid, end);
    }

    //* Merging the sorted array
    //* Time complexity :- O(n)
    public static void conquer(int[] arr, int start, int mid, int end) {
        //! Creating a new array for the merger
        int[] merge = new int[end - start + 1];

        int idx1 = start; //* This tracking first array
        int idx2 = mid + 1; //* This tracking second array

        int x = 0; //* This track the merge array

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }
        while (idx2 <= end) {
            merge[x++] = arr[idx2++];
        }

        for (int i = 0, j = start; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

}
