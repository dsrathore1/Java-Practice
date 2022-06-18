package com.company.Extra.RecursionPractice;

public class Recursion5 {
    public static void main(String[] args) {
        //* Fibonacci series : 0,1,1,2,3,5,8,11,21,....
        int ans = fib(0);
        System.out.println(ans);
    }
    static int fib(int n){
        if(n < 2){
            return 1;
        }
        return (fib(n-1) + fib(n-2));
    }
}
