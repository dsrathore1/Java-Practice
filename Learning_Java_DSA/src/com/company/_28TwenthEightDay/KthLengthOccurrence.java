package com.company._28TwenthEightDay;

public class KthLengthOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 10, 18, 20};
        int target = 10;

        int fo = firstOccurrence(arr, target);
        int lo = lastOccurrence(arr, target);
        int LengthOfOccurrence = (lo - fo) + 1;

        System.out.println("Your total no. of times element occur is :- " + LengthOfOccurrence);
    }

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                res = mid;
                end = mid - 1;
            }
        }
        return res;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                res = mid;
                start = res + 1;
            }
        }
        return res;
    }
}