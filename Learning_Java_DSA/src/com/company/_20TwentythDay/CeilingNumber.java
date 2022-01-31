package com.company._20TwentythDay;

public class CeilingNumber {
    public static void main(String[] args) {
        //! Ceiling is equal to the smallest element in array greater or equal to target element
        int[] arr = {2, 3, 5, 6, 8, 12, 78, 90};
        int target = 4;
        int ans = ceiling(arr, target);
        System.out.println("Ceiling number is on index :- " + ans);
    }

    static int ceiling(int[] a, int target) {
        //? Find the smallest element <= target element
        int start = 0;
        int end = a.length - 1;

        // but what if the target is greater than the greatest number in the array
        if (target > a[a.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
