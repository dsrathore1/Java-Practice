package com.company._23TwentyThirdDay;

public class SingleNumber {
    public static void main(String[] args) {
        /*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

                You must implement a solution with a linear runtime complexity and use only constant extra space.

                - Example 1:
                Input: nums = [2,2,1]
                Output: 1

                - Example 2:
                Input: nums = [4,1,2,1,2]
                Output: 4

                - Example 3:
                Input: nums = [1]
                Output: 1*/

        int[] nums = {4, 1, 2, 1, 2};
        int ans = findSingleNumber(nums);
        System.out.println(ans);
    }

    static int findSingleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n ^= num;
            System.out.println("n:" + n + " num:" + num);
        }
        return n;
    }
}
