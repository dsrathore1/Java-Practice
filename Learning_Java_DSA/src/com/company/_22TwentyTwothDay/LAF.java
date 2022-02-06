package com.company._22TwentyTwothDay;

import java.util.Arrays;

public class LAF {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 10, 10, 10, 18, 20};
        int target = 10;
        //First occurrence
        int fo = firstOccurrence(nums, target);
        System.out.println("Your target's first occurrence is on index :- " + fo);

        int lo = lastOccurrence(nums, target);
        System.out.println("Your target's last occurrence is on index :- " + lo);

        int[] arr = {fo, lo};
        System.out.println("Your indexes are :- " + Arrays.toString(arr));
    }

    static int firstOccurrence(int[] nums, int target) {
        int res = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                res = mid;
                end = mid - 1;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return res;
    }

    static int lastOccurrence(int[] nums, int target) {
        int res = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                res = mid;
                start = mid + 1;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return res;
    }

}
