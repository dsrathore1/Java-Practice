//? Find out the Distinct element in given array

package com.company._33ThirtyThree;

public class CountDistinctElements {
    public static void printDistinct(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    break;
            }
            if (i == j) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println("\nDistinct elements are :- " + count);
    }

    public static void main(String[] args) {
        int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        printDistinct(arr);
    }
}
