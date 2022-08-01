package com.company;

//?Given an array A of size N of integers. Your task is to find the sum of minimum and maximum elements in the array.
public class SumMaxMin {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -4, 3, 5};
        int ans = sumMax_Min(arr);
        System.out.println("\nYour sum of max and min value is :- " + ans);
    }

    public static int sumMax_Min(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Your sorted Array is : ");
        for (int m : arr) {
            System.out.print(m + " ");
        }
        return arr[0] + arr[arr.length - 1];
    }
}
