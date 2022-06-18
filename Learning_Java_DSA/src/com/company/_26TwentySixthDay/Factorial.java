package com.company._26TwentySixthDay;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans1 = factorial(n);
        System.out.println("Factorial of nth term is :- " + ans1);
        int ans2 = sumOfDigit(n);
        System.out.println("Sum of nth term is :- " + ans2);
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return (n * factorial(n - 1));
    }

    static int sumOfDigit(int n) {
        if (n <= 1) {
            return 1;
        }
        return (n + sumOfDigit(n - 1));
    }
}
