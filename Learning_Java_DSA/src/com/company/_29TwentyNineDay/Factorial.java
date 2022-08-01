//? Write a recursive function that takes a number as an input and returns the factorial of that number

package com.company._29TwentyNineDay;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your factorial number :- ");
        int num = sc.nextInt();
        int ans = factorial(num);
        System.out.println("\n" + num + "!" + " = " + ans);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return (n * factorial(n - 1));
    }
}
