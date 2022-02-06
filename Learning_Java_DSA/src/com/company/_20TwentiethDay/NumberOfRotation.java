package com.company._20TwentiethDay;

public class NumberOfRotation {
    public static void main(String[] args) {
        int[] a = {8, 9, 10, 1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array is rotated " + numRotation(a) + " times");
    }

    static int numRotation(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[start] <= a[end]) {
                return start;
            }

            if (a[mid] < a[mid + 1] && a[mid] < a[mid - 1]) {
                return mid;
            } else if (a[mid] <= a[end]) {
                end = mid - 1;
            } else if (a[mid] >= a[end]) {
                start = mid + 1;
            }
        }

        return -1;
    }
}
