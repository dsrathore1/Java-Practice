package com.company._21TwentyFirstthDay;

//? Given a circularly sorted integer array, search an element in it. Assume there are no duplicates in the array, and the rotation is in the anti-clockwise direction.


public class FindElement {
    public static void main(String[] args) {
        int[] nums = {8, 9, 10, 2, 5, 6};
        int target = 6;

        int ans = findTheTarget(nums, target);
        System.out.println(ans);
    }

    static int findTheTarget(int[] nums, int target) {
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
