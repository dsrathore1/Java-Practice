package com.company;

public class SumOfNaturalNumber {
    public static void method1(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println("\nRegular method of sum of number using loop " + sum);
    }

    public static void method2(int y) {
        int sum = y * (y + 1) / 2;
        System.out.println("The sum of first " + y + " number is :- " + sum);
    }

    static int method3(int z) {
        if (z == 0) return 0;
        return z + method3(z - 1);
    }

    public static void main(String[] args) {
        int x = 5;
        //! This solution is good but not much affective with Time Complexity : O(N)
        method1(x);


        //! Method 2 :- Very optimal with Time Complexity : O(1)
        int y = 5;
        method2(y);

        //! Method 3 :- Recursive way to sum
        int ans = method3(x);
        System.out.println("The recursive sum of " + x + " is " + ans);
    }
}
