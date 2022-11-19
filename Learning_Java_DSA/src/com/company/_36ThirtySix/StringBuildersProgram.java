package com.company._36ThirtySix;

public class StringBuildersProgram {
    public static void main(String[] args) {
        //! String Builders are mutable but strings are not mutable they are immutable
        //! we concatenate in string then time complexity is O(N^2);
        //! Concatenate StringBuilders so, there time complexity is O(N)
        String str = "apple";

        StringBuilder sb = new StringBuilder("Banana");

        //! Find the character at given index
        System.out.println("Character at 0 index is :- " + sb.charAt(0));

        //! Find the Length of the String
        System.out.println("The length of the String is :- " + sb.length());

        //! Concatenate the Strings in StringBuilder
        sb.append("-Grapes");
        sb.append("-Orange");
        sb.append("-StarFruit");
        System.out.println(sb);

    }
}
