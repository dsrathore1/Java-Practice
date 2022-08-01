package com.company;

//? Find a sum of continuous sub-array.
public class Subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int sum = sumOfSubArray(arr);
        System.out.println("Sum of subarray is :- " + sum);
    }

    public static int sumOfSubArray(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                result += temp;
            }
        }
        return result;
    }
}
