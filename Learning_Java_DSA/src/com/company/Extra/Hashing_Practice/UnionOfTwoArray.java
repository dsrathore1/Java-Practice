package com.company.Extra.Hashing_Practice;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoArray {
    public static void mergeTheArray(int[] a, int[] b) {
        //! Add two array in one array
        //! With Time Complexity :- O(M+N)

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
        System.out.println(hs + " ");
    }

    public static void anotherWayToMerge(int[] a, int[] b) {
        //! Another way to merge two array
        int length2 = a.length + b.length;

        int[] c = new int[length2];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 15, 5};
        int[] b = {10, 15, 4, 5};

        mergeTheArray(a, b); //! Time complexity :- O(M+N)
        System.out.print("Another way to merge the two array :- "); //! Merge array using arraycopy
        anotherWayToMerge(a, b); //! Time complexity :- O(M+N)
    }
}
