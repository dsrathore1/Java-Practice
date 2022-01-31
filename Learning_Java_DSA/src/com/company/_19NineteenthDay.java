package com.company;

import java.util.Arrays;

public class _19NineteenthDay {
    public static void main(String[] args) {
/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
 */
        int[] nums = {1, 2, 5, 5};
        int target = 3;
        int[] nums2 = {1, 3, 4, 2, 2};
        int c = findRepeatedValue(nums);
        System.out.println(c);
        int d = findRepeatedValue(nums2);
        System.out.println(d);

        int bs = binarySearch(nums, target);
        System.out.println("\nYour target is on index :- " + bs);
    }

    public static int findRepeatedValue(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
