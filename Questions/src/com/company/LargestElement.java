package com.company;

public class LargestElement {
    public static int method1(int[] nums, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    temp = nums[j + 1];
                }
            }
        }
        return temp;
    }



    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90, 54, 109, 3, 78, 901};
        int ans = method1(arr, arr.length);
        System.out.println(ans);

    }
}