package com.company;

import java.util.Arrays;

class Solution {
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int k = 0; k < nums.length; k++) {
            for (int j = k + 1; j < nums.length; j++) {
                if (nums[k] + nums[j] == target) {
                    return new int[]{k, j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 7};
        int target = 6;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));

        Solution sol = new Solution();
        int[] and1 = sol.twoSum2(arr, target);
        System.out.println(Arrays.toString(and1));
    }
}
