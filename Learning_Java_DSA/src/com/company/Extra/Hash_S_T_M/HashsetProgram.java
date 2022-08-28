package com.company.Extra.Hash_S_T_M;

import java.util.HashSet;

//* HashSet inherits AbstractSet class and implements Set interface. Set objects are always unique and no duplicate objects are allowed. One null key value is allowed. The hashing mechanism is used to insert the objects into a HashSet.

public class HashsetProgram {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(22);
        hs.add(36);
        hs.add(64);
        hs.add(15);

        System.out.println(hs);
    }
}
