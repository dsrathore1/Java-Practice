package com.company._26TwentySixthDay;

public class Recursion {
    public static void main(String[] args) {
        //* Print 1-5 with recursion
        reversePrinter(5);
        serialPrinter(5);
    }

    static void reversePrinter(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        reversePrinter(n - 1);
    }

    static void serialPrinter(int m) {
        if (m == 0) {
            return;
        }
        serialPrinter(m - 1);
        System.out.print(m + " ");
    }
}
