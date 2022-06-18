package com.company.Extra.RecursionPractice;

public class Recursion2 {
    public static void main(String[] args) {
//* We have cats and each cat have two eyes. Send the number of cats to a function and return the total number of eyes all cats have.
        int ans = catEyes(5);
        System.out.println("The total number of eyes all cats have :- " + ans);
    }

    public static int catEyes(int n) {
        if (n == 0) {
            return 0;
        }
        return catEyes(n - 1) + 2; //! Parameter is act like index no. into recursion
    }
}
