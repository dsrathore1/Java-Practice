package com.company;

public class PowerOfFour {
    public static boolean method1(int n) {
        if (n == 1) return true;

        if (n % 4 != 0 || n <= 0) {
            return false;
        }
        return method1(n / 4);
    }

    public static void main(String[] args) {
        int n = 16;
        boolean ans = method1(n);
        System.out.println(ans);
    }
}
