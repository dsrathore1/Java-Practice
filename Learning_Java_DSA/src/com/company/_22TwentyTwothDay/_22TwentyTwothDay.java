package com.company._22TwentyTwothDay;

/*
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Example 1:

Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.

Example 2:

Input:
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.

*/

public class _22TwentyTwothDay {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        int ans = findTheNum(arr, target);
//        System.out.println(ans);

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 2;
        int ans2 = search(nums, target2);
        System.out.println(ans2);
    }

    static int findTheNum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            if (nums[mid] <= nums[end]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
