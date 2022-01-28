package com.company;

public class _18EighteenthDay {
    public static void main(String[] args) {
        //!Patterns
        int n = 5;
//        System.out.println("\n");
//        pattern1(n);
//        System.out.println("\n");
//        pattern2(n);
//        System.out.println("\n");
//        pattern3(n);
//        System.out.println("\n");
        pattern4(n);
        System.out.println("\n");


    }

    static void pattern1(int n) {
/*
        #
        ##
        ###
        ####
        #####
        */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("#");
            }
            System.out.println("#");
        }


        //! Also, we do this way to
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
/*
        ####
        ###
        ##
        #
         */

        for (int i = 0; i < n; i++) {
            for (int j = 1; j >= i - 1; j--) {
                System.out.print("#");
            }
            System.out.println("#");
        }

        //! Also, we do this way to
        for (int i = 0; i < n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        /*
         *****
         *****
         *****
         *****
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
