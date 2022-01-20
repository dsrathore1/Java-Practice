package com.company._11EleventhDay;

public class MergeArray {
    public static void main(String[] args) {
        // Merging two sorted array
        /*
        Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
        Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}*/

        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = new int[arr1.length + arr2.length];

        for (int i : mergedArray) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
