package com.company;

public class ReverseTheString {
    public static void reverse(int i, String st) {

        if (i == 0) {
            System.out.print(st.charAt(i));
            return;
        }
        System.out.print(st.charAt(i) + " ");
        reverse(i - 1, st);
    }

    public static void main(String[] args) {
        String st = "abed";

        //! Time Complexity => O(n)
        reverse(st.length() - 1, st);
    }
}
