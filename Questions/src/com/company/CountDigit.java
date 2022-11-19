package com.company;

//! Given an integer N, write a program to count number of digit in N
public class CountDigit {
    static void method1(int n) {
        //* Divide the number with 10 and count each remainder remains. Time Complexity : O(n)
        int x = n;
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        System.out.println("Divide the digit by 10 :- " + count);
    }

    static void method2(int n) {
        //* Converted into string with Time Complexity : O(1)
        String x = Integer.toString(n);
        System.out.println("Converted number into string :- " + x.length());
    }

    static void method3(int n) {
        int x = (int) Math.floor(Math.log10(n) + 1);
        System.out.println("Use of logarithm :- " + x);
    }

    static int method4(int n) {
        if (-10 < n && 10 > n) {
            return 1;
        }
        return (method4(n / 10) + 1);
    }

    public static void main(String[] args) {
        int n = 12345;
        //* Method 1
        method1(n);

        //* Method 2
        method2(n);

        //* Method 3
        method3(n);

        //* Method 4
        int ans = method4(n);
        System.out.println("Use of recursion :- " + ans);
    }
}
