package com.company;

public class Anagram {
    public static void main(String[] args) {
        boolean isAnagram = anagram();
        System.out.println("A string is not an anagram :- " + isAnagram);
    }

    public static boolean anagram() {
        String word = "rat";
        String word2 = "cat";

        char[] arr1 = word.toCharArray();
        char[] arr2 = word2.toCharArray();

        for (int j = 0; j < arr1.length; j++) {
            for (int i = j; i < arr2.length; i++) {
                if (arr1[j] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
