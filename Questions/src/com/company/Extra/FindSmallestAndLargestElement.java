package com.company.Extra;

import java.util.Arrays;
import java.util.Collections;

public class FindSmallestAndLargestElement {

    //! Builtin function - Collections & Arrays
    public static void method2(Integer[] arr) {
        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));

        System.out.println("The min value of array is :- " + min);
        System.out.println("The max value of array is :- " + max);
    }

    //! For Loop Method
    public static void method4(int[] arr) {
        int min = arr[0];
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.println("Max value is :- " + max);
        System.out.println("Min value is :- " + min);
    }



    public static void main(String[] args) {
        //* Approach
        /*
         * 1. Sort the array and give arr[0] and arr[nth] value. TimeComplexity :- O(n^2)
         * 2. Use builtin function Collection.max(Arrays.asList(arr)) and Collection.min(Arrays.asList(arr)) TimeComplexity :- O(n(log n))
         * 3. Use recursion TimeComplexity :- O(n)
         * 4. Two for loop first for small and second for largest with the help of two pointer. TimeComplexity :- O(n)
         */

        Integer[] arr = {2, 1, 4, 7, 6, 34};
        int[] arr2 = {2, 1, 4, 7, 6, 34};

        method2(arr);
        method4(arr2);
    }
}
