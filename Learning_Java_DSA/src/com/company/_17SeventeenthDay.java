package com.company;

import java.util.Scanner;

public class _17SeventeenthDay {
    public static void main(String[] args) {
        // Linear Search

        Scanner sc = new Scanner(System.in);

        int[] num = {23, 43, 54, 2, 53, 75, 24, 76, 45};
        System.out.println("Enter your target below :-");
        int target = sc.nextInt();
        System.out.println("Your target is on index no. :- " + linerSearch(num, target));
    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linerSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}


class SearchInStrings {
    public static void main(String[] args) {
        String name = "Digpal";
        char target = 'g';

        System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {

        for (int s = 0; s < str.length(); s++) {
            if (target == str.charAt(s)) {
                return true;
            }
        }
        return false;

    }
}