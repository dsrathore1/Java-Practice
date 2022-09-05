package com.company._35ThirtyFifth;

//* Implementation of separate chaining without collision Solution

class HashTable {
    String k;
    int[] value;

    HashTable(int size) {
        value = new int[size];
    }

    int hashFunction(String key) {
        int index;
        index = key.length() % value.length;
        return index;
    }

    void put(String k, int v) {
        int index = hashFunction(k);
        value[index] = v;
    }

    void get(String k) {
        int index = hashFunction(k);
        System.out.println("Value :- " + value[index]);
    }

}

public class SeparateChainingWithoutCollision {
    public static void main(String[] args) {
        HashTable ht = new HashTable(20);

        ht.put("one", 1);
        ht.put("two", 24);
        ht.put("three", 12);

        ht.get("two");

    }
}


