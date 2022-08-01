//? Write a recursive function that takes a list of numbers as input and returns the product of all the numbers in list
package com.company._29TwentyNineDay;

import java.util.Scanner;

public class ProductOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the natural number :- ");
        int num = sc.nextInt();

        long ans = product(num);
        System.out.println("Product of number :- " + ans);
    }

    public static long product(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return (num * product(num - 1));
    }
}
