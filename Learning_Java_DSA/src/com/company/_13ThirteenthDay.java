package com.company;

public class _13ThirteenthDay {
    public static void main(String[] args) {
        // Finding the max and min value in array
        // Maximum value
        int[] ar = {3, 5, 1, 76, 37, 38, 22, 95, 0, -2};
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        // Min value
        int min = ar[0];
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] < min) {
                min = ar[j];
            }
        }
        System.out.println("Max value is :- " + max);
        System.out.println("Min value is :- " + min);
    }


}

// Finding the second-largest element in Array
class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 1, 37, 38, 22, 67};

        a(arr1);
        printingArray(arr1);
    }

    static void a(int[] arr1) {
        for (int l = 0; l < arr1.length - 1; l++) {
            for (int k = 0; k < arr1.length - l - 1; k++) {
                if (arr1[k] < arr1[k + 1]) {
                    int temp = arr1[k];
                    arr1[k] = arr1[k + 1];
                    arr1[k + 1] = temp;
                }
            }
        }
    }

    static void printingArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.print("\nYour second largest element is :- " + arr[1]);
    }
}