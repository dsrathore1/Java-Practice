package com.company;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 4, 7, 6};
        reverseTheNumber(arr);
    }

    public static void reverseTheNumber(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
