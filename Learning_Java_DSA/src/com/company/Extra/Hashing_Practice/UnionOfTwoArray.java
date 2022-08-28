package com.company.Extra.Hashing_Practice;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoArray {
    public static void mergeTheArray(int[] a, int[] b) {
        //! Add two array in one array
        int length = a.length + b.length;
        int[] result = new int[length];

        int pos = 0;
        for (int element : a) {
            result[pos] = element;
            pos++;
        }
        for (int element2 : b) {
            result[pos] = element2;
            pos++;
        }
        System.out.print("Before Union :- " + Arrays.toString(result) + " "); //* Added two array in one array

        //! Now create Union of two array
        HashSet<Integer> hs = new HashSet<>();

        for (int j : result) {
            hs.add(j);
        }

        System.out.print("\nAfter Union :- ");
        System.out.print(hs + " ");
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 15, 5};
        int[] b = {10, 15, 4, 5};

        mergeTheArray(a, b);
    }
}
