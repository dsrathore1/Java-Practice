package com.company;

public class SumOfNaturalNumber {
    public static void method1(int x) {
        //! This solution is good but not much affective with Time Complexity : O(N)
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void method2(int y) {
        int sum = y * (y + 1) / 2;
        System.out.println("The sum of first " + y + " number is :- " + sum);
    }

    public static void main(String[] args) {
        int x = 5;
        method1(x);


        //! Method 2 :- Very optimal with Time Complexity : O(1)
        method2(6);
    }
}
