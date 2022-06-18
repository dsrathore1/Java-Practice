package com.company.Extra.RecursionPractice;

public class Recursion3 {
    public static void main(String[] args) {
        //* Find power by sending base and power value to a function
        System.out.println((powerCounter(3, 2)));
    }

    public static int powerCounter(int power, int base) {
        if (power == 0) {
            return 1;
        }
        return (powerCounter(power - 1, base) * base);
    }
}
