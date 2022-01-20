package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _12TwelfthDay {
    public static void main(String[] args) {
        // Two Sum
        int[] num = {2, 7, 4, 5, 13, 44, 6, 32, 3};
        int target = 9;

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    int[] ar = {num[i], num[j]};
//                    System.out.println(num[i] + " " + num[j]);
                    System.out.print(Arrays.toString(ar) + " ");
                }
            }
        }

        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int i = 0;
        while (i < test) {
            System.out.println(i + 1);
            i++;
        }
    }
}

// Bubble Sort
class BubbleSort {
    public static void printing(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 76, 37, 38, 22};

        SecondLargestElement.a(arr);
        printing(arr);
    }
}

// Convert the integer to string;
class Converter {
    public static void main(String[] args) {
        int i = 23;
        String s = Integer.toString(i);
        System.out.printf("Adding 44 into the integer (%s) :- ", i);
        System.out.println(i + 44);// Adding 44 into the integer
        System.out.printf("Adding 44 into the String (%s) :- " + s + 44, s); // Adding 44 into the String

        intToString();

    }

    /*
    	Submissions	Leaderboard	Discussions	Editorial
You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise, it will print "Wrong answer".

 can range between  to  inclusive.
 */

    public static void intToString() {
        int i = 100;
        String s = Integer.toString(i);
        if (s != s) {
            System.out.println("Wrong answer");
        } else {
            System.out.println("Good job");
        }
    }
}

