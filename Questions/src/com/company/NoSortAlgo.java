package com.company;

//! Dutch National Flag Algorithm
public class NoSortAlgo {
    static void noSort(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int temp;
        int mid = 0;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0 -> {
                    temp = nums[low];
                    nums[low++] = nums[mid];
                    nums[mid++] = temp;
                }
                case 1 -> mid++;
                case 2 -> {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high--] = temp;

                }
            }
        }
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 2, 0, 1, 2, 0};
        noSort(arr);
    }


}
