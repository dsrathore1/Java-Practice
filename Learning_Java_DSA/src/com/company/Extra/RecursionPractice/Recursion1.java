package com.company.Extra.RecursionPractice;

public class Recursion1 {
    public static void main(String[] args) {
        //* Print nth value to 1
        int n = 5;
        printNToOne(n);
    }

    static void printNToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNToOne(n - 1);
    }
}
