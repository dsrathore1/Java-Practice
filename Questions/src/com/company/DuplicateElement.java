package com.company;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 1, 4, 7, 4};
        Set<Integer> s = new HashSet<>();

        for (int i : arr) {
            s.add(i);
        }
        System.out.println(s);
        System.out.println(s.contains(2));
    }
}
