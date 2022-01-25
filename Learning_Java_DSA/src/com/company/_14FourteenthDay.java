package com.company;

import java.util.Scanner;

public class _14FourteenthDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] number = new int[n];

        // Taking input from the user
        for (int i = 0; i < n; i++) {
            number[i] = scan.nextInt();
        }

        int x = scan.nextInt();


        // Print the output of the array
        for (int j = 0; j < number.length; j++) {
            System.out.print(number[j] + " ");
            if (number[j] == x) {
                System.out.println("\n\nYour element is present on index no. :- " + j);
            }
        }
    }
}

// 2D Arrays

class twoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] number = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        // For Printing the output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}