package com.company._23TwentyThirdDay;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {-5, -4, -3, -2, 0, 1, 4, 6, 8};
        findSumOfTwo(nums); //* Found
        findSumZeroByBs(nums);
    }

    // By normal way Time Complexity is O(n^2) quadratic equation
    static void findSumOfTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 0) {
                    System.out.printf("Pair found at index (%s, %s)", i, j);
                    return;
                }
            }
        }
    }

    static void findSumZeroByBs(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int target = 0;

        while (start <= end) {
            if (nums[start] + nums[end] == target) {
                System.out.printf("\nPair found at index :- (%s, %s)\n", start, end);
                return;
            }
            if (target < nums[start] + nums[end]) {
                end--;
            } else if (target > nums[start] + nums[end]) {
                start++;
            }
        }
        System.out.println("Pair not found :- (-1, -1)");
    }
}