package com.company.Extra.Hashing_Practice;

import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static int intersect(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;

        for (int i : a) {
            hs.add(i);
        }
        for (int j : b) {
            if (hs.contains(j)) {
                count++;
                hs.remove(j);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 15, 5, 10};
        int[] b = {15, 5, 5, 10, 4};

        int intersected = intersect(a, b);
        System.out.println(intersected);
    }
}
