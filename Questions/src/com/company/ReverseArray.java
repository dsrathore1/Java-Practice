package com.company;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 22, 5, 24, 76, 46, 88, 43};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
