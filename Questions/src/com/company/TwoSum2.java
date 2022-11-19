package com.company;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;

        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            if (arr[start] + arr[end] == target) {
                return new int[]{start+1, end+1};
            }
            if (arr[start] + arr[end] < target) {
                start = start + 1;
            } else {
                end = end - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
