package com.company;

public class NumberIsPalindrome {
    public static boolean reverseTheNumber(int x) {
        int m = x;
        int y = 0;
        if (m < 0) {
            return false;
        }
        while (x != 0) {
            int digit = x % 10;
            y = y * 10 + digit;
            x /= 10;
        }
        return m == y;
    }

    public static void main(String[] args) {
        //* Time Complexity : O(logN)

        int x = 121;
        boolean y = reverseTheNumber(x);

        System.out.println(y);
    }
}
