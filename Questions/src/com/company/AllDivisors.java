package com.company;

public class AllDivisors {
    public static void divisors(int x) {
        for (int i = 1; i <= x; i++) {
            //! Reminder remains == 0;
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num = 97;
        divisors(num);
    }
}
