package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _17SeventeenthDay {
    public static void main(String[] args) {
        // Linear Search
        Scanner sc = new Scanner(System.in);

        int[] num = {23, 43, 54, 2, 53, 75, 24, 76, 45};
        String str = "Digital Rather Technology";

        //! Index value find into the array
        System.out.println("Enter your target below :-");
        int target1 = sc.nextInt();
        System.out.println("\nYour target is present on index :- " + linerSearch(num, target1));

        //! Char Find into the String
        char target = 'R';
        System.out.println("\nIs target present into the String?\n" + searchInString(str, target));

        //! Find the index value between given range
        int target2 = 53;
        int start = 2;
        int end = 5;
        System.out.println("\nYour target is present on index :- " + range(num, target2, start, end) + "\tBetween " + start + " to " + end);

        //! Find the max and min number in array using linear search
        findMaxMin(num);
    }

    //* search in the array : return the index if item found
    //* otherwise if item not found return -1
    static int linerSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //* search in string : return true if item found
    //* otherwise if item not found return false
    static boolean searchInString(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    //* Search the value between the given range: if found return true
    //* Otherwise element not found: return false
    static int range(int[] a, int target, int start, int end) {
        if (target == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == a[i]) {
                return i;
            }
        }
        return -1;
    }

    //* Finding the maximum and minimum element into the array with Linear Search
    static void findMaxMin(int[] arr) {
        Arrays.sort(arr);

        System.out.println("Min :- " + arr[0]);
        System.out.println("Max :- " + arr.length);
    }
}