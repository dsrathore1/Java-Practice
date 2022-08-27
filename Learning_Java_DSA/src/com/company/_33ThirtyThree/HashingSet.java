package com.company._33ThirtyThree;

import java.util.*;

public class HashingSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(23); //1
        hs.add(43); //2
        hs.add(99); //3
        hs.add(54); //4
        hs.add(75); //5

        System.out.println(hs);

        if (hs.contains(43)) {  //! Checking 43 is present into the set or not ?
            System.out.println("43 is present into the set?\tPresent");
        } else {
            System.out.println("Not Present");
        }

        System.out.println("Before removing element from the set :- " + hs.size());

        hs.remove(99);

        System.out.println("After removing 99 from the set :- " + hs.size()); //! It will give you the present elements

        System.out.println("The remaining elements are :- " + hs);
        System.out.println("Hash set is empty? :- " + hs.isEmpty());

        System.out.print("Before cloning :- ");
        System.out.println(hs);

        hs.clone();
        System.out.print("After cloning :- ");

        System.out.println(hs);

        hs.clear();

        System.out.println(hs);

    }
}
