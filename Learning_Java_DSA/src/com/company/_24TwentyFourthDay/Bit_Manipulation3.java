package com.company._24TwentyFourthDay;

//! Remaining

public class Bit_Manipulation3 {
    public static void main(String[] args) {
        //? Write a function that takes an integer and returns the number of 1 bits it has.
        int a = 11;
        a = a & (-a);
        long b = a;
        System.out.println(b);
    }
}
