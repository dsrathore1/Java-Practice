package com.company._20TwentiethDay;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int target = 4;
        int ans = firstAndLastOccurrence(arr, target);
        System.out.println(ans);
    }

    static int firstAndLastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
