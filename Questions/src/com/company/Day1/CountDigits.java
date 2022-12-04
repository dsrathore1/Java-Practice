package com.company.Day1;

public class CountDigits {
    public static int count(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 6, 7, 5};
        int ans = count(arr);
        System.out.println("Total elements are present in array :- " + ans);

    }
}
