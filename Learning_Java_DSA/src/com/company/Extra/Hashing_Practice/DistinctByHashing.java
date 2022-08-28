package com.company.Extra.Hashing_Practice;

import java.util.HashSet;

public class DistinctByHashing {
    public static void Hashing(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for (int j : a) {
            hs.add(j);
        }
        System.out.print(hs + " ");
        System.out.println("\nThe size of set is :- " + hs.size());
    }

    public static void main(String[] args) {
        int[] a = {2, 33, 2, 45, 33, 23, 22, 1};
        Hashing(a);
    }

}
