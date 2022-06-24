package com.company._27TwentySeventhDay;

public class _27TwentySeventhDay {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 10, 10, 18, 20};
        int target = 10;
        int lf = lastAndFirstOccurrence(arr, target);
        System.out.println(lf);
    }

    static int lastAndFirstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                if (target == arr[mid] - 1) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        System.out.println("Target is not found in array :- ");
        return -1;
    }
}