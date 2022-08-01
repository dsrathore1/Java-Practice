//? Write a recursive function that takes a number and returns the sum of all the number from zero to that number

package com.company._29TwentyNineDay;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int num = 23;
        int sum = sumOfNumber(num);
        System.out.println(sum);
    }

    public static int sumOfNumber(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return (num + sumOfNumber(num - 1));
    }
}
