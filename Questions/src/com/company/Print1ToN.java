package com.company;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 5;
        count(1, n);
    }

    public static void count(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        count(i + 1, n);
    }
}
