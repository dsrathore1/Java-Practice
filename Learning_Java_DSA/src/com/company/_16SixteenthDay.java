package com.company;

public class _16SixteenthDay {
    public static void main(String[] args) {
        // Reverse the array

        int[] a = {9, 8, 7, 6, 5, 4, 3};

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }
}


class MaxMin {
    public static void main(String[] args) {
        //Maximum and minimum of an array using minimum number of comparisons
        int[] b = {9, 88, 7, 16, 5, 4, 3};
//
//        System.out.println("Your Array is :-");
//        for (int i : b) {
//            System.out.print(i + " ");
//        }

        // Bubble sort
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - i - 1; j++) {
                if (b[j] < b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
        for (int k : b) {
            System.out.print(k + " ");
        }
        System.out.println("\nYour Maximum number is :- " + b[0]);
    }
}