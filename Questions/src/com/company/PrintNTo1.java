package com.company;

public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 5;
        count(1, n);
    }

    public static void count(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(n + " ");
        count(i, n - 1);
    }
}
