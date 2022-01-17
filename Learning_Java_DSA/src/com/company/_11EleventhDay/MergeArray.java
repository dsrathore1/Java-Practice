package com.company._11EleventhDay;

public class MergeArray {
    public static void main(String[] args) {
        // Merging two sorted array
        /*
        Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
        Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}*/

        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        for (int j : arr1) {
            System.out.print(j + " ");
        }
        for (int k : arr2) {
            System.out.print(k + " ");
        }
    }
}
