//? Write a recursive function that takes a number 'n' and returns the nth number of the Fibonacci number

package com.company._29TwentyNineDay;

public class FibonacciSequence {

    //? What are the first 12 Fibonacci numbers?
    //* 0, 1, 1, 2, 3, 5, 8, 13,21,34,55,89,144

    public static void main(String[] args) {
        int num = 4;
        long ans = fib(num);
        System.out.println(ans);
    }

    public static long fib(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return (fib(n - 1) + fib(n - 2));
    }
}
