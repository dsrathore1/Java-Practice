package com.company;

public class BinarySearch {
    public static int method1(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int method2(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                return method2(arr, target, start, mid - 1);
            } else {
                return method2(arr, target, mid + 1, end);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 12, 23, 45, 67, 87};
        int target = 45;

        //! Method 1 :- Iterative call
        int ans = method1(arr, target);
        System.out.println("Iterative Method :- " + ans);

        //! Method 2 :- Recursive Call
        int start = 0;
        int end = arr.length;
        int ans2 = method2(arr, target, start, end);
        System.out.println("Recursive Method :- " + ans2);
    }
}
