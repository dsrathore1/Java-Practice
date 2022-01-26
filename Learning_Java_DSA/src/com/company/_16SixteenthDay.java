package com.company;

public class _16SixteenthDay {
    public static void main(String[] args) {
        int[] a = {9, 18, 7, 26, 5, 4, 35};

        //* Functions
        reverseTheArray(a); //* Reverse the array
        System.out.println("\n");
        findMaxMin(a); //* Finding the Maximum and minimum value into the Array
    }

    //! Reverse the array
    static void reverseTheArray(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }

    static void findMaxMin(int[] a) {
        //! Bubble sort
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Descending ordered sorted array is :- ");
        for (int k : a) {
            System.out.print(k + " ");
        }
        System.out.println("\nYour Maximum number is :- " + a[0]);

        //! Insertion sort
        for (int k = 0; k < a.length; k++) {
            int temp, j;
            temp = a[k];
            j = k;
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }
        System.out.println("\nAscending ordered sorted array is :- ");
        for (int l : a) {
            System.out.print(l + " ");
        }
        System.out.println("\nYour Minimum number is :- " + a[0]);
    }
}