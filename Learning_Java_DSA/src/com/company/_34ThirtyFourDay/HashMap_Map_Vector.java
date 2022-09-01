package com.company._34ThirtyFourDay;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class HashMap_Map_Vector {
    public static void maps() {
        //* In Map<> keys are in sorted order & insertion of particular key will take O(log n)

        Map<Integer, String> ma = new HashMap<Integer, String>();
        //! Insert elements to the map
        ma.put(1, "Car");
        ma.put(4, "Bike");
        ma.put(3, "Bus");
        ma.put(2, "Truck");
        ma.put(23, "Cycle");

        System.out.println("***Maps***");

        //! Access all the Map
        System.out.println("Map<Integer, String> :- " + ma);
        //! Access all the value
        System.out.println("Values :- " + ma.values());
        //! Access all the keys
        System.out.println("Keys :- " + ma.keySet());
        //! Access entries of the map
        System.out.println("Entries :- " + ma.entrySet());
        //! Remove element from the map
        String value = ma.remove(2);
        System.out.println("Removed :- " + value);
        System.out.println("After removed all the values :- " + ma);
    }

    public static void hashmaps() {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Yoe");
        hm.put(2, "Ramesh");
        hm.put(3, "Lucky");
        hm.put(4, "Umesh");
        hm.put(43, "Poll");


        System.out.println("***HashMaps***");
        //! Access HashMap
        System.out.println("HashMap<Integer, String> :- " + hm);
        //! Access all the keys
        System.out.println("Keys :- " + hm.keySet());
        //! Access all the values
        System.out.println("Values :- " + hm.values());
        //! Access all entries
        System.out.println("Entries :- " + hm.entrySet());
        //! Remove value from hashmap
        String value = hm.remove(2);
        System.out.println("Removed Value :- " + value);
        System.out.println("After removed values are :- " + hm);
    }

    public static void vectorProgram() {
        Vector<Integer> v = new Vector<>();

        v.add(23);
        v.add(43);
        v.add(12);
        v.add(5);
        v.add(65);
        
        System.out.println("***Vector***");

        //! Access all the values
        System.out.println("Values :- " + v);
        //! Removed value
        int removedValue = v.remove(3);
        System.out.println("Remove :- " + removedValue);
        //! Element at index
        System.out.println("Element at index 3 :- " + v.elementAt(3));

        //! Vector capacity
        System.out.println("Capacity :- " + v.capacity());

    }


    public static void main(String[] args) {
        maps();
        hashmaps();
        vectorProgram();
    }
}
