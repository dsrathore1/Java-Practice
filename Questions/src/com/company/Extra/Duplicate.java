package com.company.Extra;

import java.util.HashSet;

public class Duplicate {
    public static boolean duplicateValue(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int j : arr) {
            if (!hs.add(j)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 9, 2};
        boolean ans = duplicateValue(arr);
        System.out.println("Is there any duplicate value :- " + ans);
    }
}
