package com.company._10TenthDay;

public class Strings {
    public static void main(String[] args) {
        int a = 2;
        float b = 3.539593f;
        System.out.printf("First element is integer %d and second element is %f", a, b); // printf function with String.
        System.out.printf("\nFirst element is integer %d and second element is %20.2f", a, b); // 20.2 gives space 20's from strings to floating value.
        System.out.format("\nFirst element is integer %d and second element is %.2f", a, b); // format function also work same as printf function.
    }
}
