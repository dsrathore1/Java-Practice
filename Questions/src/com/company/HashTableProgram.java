package com.company;

import java.util.Hashtable;

public class HashTableProgram {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        ht.put(1, "Joe");
        ht.put(2, "Umesh");
        ht.put(3, "Rahul");
        ht.put(4, "Doe");
        ht.put(5, "Patrik");

        for (String j : ht.values()) {
            System.out.print(j + " ");
        }

    }
}
