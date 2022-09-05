package com.company._34ThirtyFour;

import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String[] args) {
        //* ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        al.add(32);
        al.add(1);
        al.add(2, 43);
        al.add(54);
        al.add(23);
        al.add(2);
        al.add(3);
        al.add(8);

        System.out.println("ArrayList :- " + al);

        System.out.print("Array's elements :- ");
        for (int j : al) {
            System.out.print(j + " ");
        }

        int removed = al.remove(3);
        System.out.println("\nAfter removed index 3 now Array List is :- " + al);
        System.out.println("The value removed is :- " + removed);
        System.out.println("Array List contains 43 ? " + al.contains(43));
    }
}
