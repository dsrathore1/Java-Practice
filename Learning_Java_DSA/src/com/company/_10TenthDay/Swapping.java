package com.company._10TenthDay;

import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        // Swap the array element
        int[] arr = {1, 3, 5, 6, 35, 26, 64};
        int index1 = 0;
        int index2 = 6;
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
