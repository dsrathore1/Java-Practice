package com.company;

import java.util.Arrays;

public class Max_Min {
    public static void main(String[] args) {
        int[] arr = {2, 56, 6, 75, 34, 76, 29};
        int[] min_maxValue = min_maxValue(arr);
        System.out.println("\n" + Arrays.toString(min_maxValue));
    }

    public static int[] min_maxValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
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
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}
