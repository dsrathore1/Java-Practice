package com.company.Day2;

public class ReverseNumber {
    public static void rNum(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 77, 8, 9};
        rNum(arr);
    }
}
