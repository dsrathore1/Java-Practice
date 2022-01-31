package com.company;


import java.util.Arrays;

public class _2SecondDay {

    //Functions

    //Product Function
    public static void product(int a, int b) {
        int c = a * b;
        System.out.println("The product of two number is " + c);
    }

    //Addition Function
    public static void sumOfTwoNum(int a, int b) {
        int c = a + b;
        System.out.println("The sum of two number is " + c);
    }

    public static void subOfTwoNumber(int a, int b) {
        int c = b - a;
        System.out.println("The subtraction of two number is " + c);
    }

    public static void main(String[] arg) {
        int a = 4;
        int b = 5;
        product(a, b);
        sumOfTwoNum(a, b);
        subOfTwoNumber(a, b);

        System.out.println("\n");
        int[] arr = {4, 67, 2, 3, 7, 35, 8, 9, 20};
        int target = 11;

        twoSum(arr, target);
    }

    static void twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println('\n');
        for (int i = 0; i < arr.length - 1; i++) {
            if (target == arr[i] + arr[i + 1]) {
                System.out.printf("Pair Found :- (%s, %s)", arr[i], arr[i + 1]);
            }
        }
    }
}
