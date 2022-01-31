package com.company._20TwentythDay;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] as = {1, 3, 5, 7, 9, 11};
        int[] ds = {11, 9, 7, 5, 3, 1};

        int target = 9;

        int ans = orderAgnostic(ds, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[0] > arr[1]) {
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
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
