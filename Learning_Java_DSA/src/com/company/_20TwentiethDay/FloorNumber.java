package com.company._20TwentiethDay;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {90, 82, 72, 63, 54, 51, 43, 39, 28, 17};
        int target = 24;

        int ans = floorNumber(arr, target);
        System.out.println("Floor number is on index :- " + ans);
    }

    static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
