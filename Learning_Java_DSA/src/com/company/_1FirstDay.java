package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class _1FirstDay {

    public static void main(String[] args) {
//take input of 2 number and print the sum
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of a : - ");
        int a = in.nextInt();
        System.out.print("Enter the value of b : - ");
        int b = in.nextInt();

        int c = a + b;
        System.out.println("The sum of two number is := " + c);

        varArgs(3,5,6,3,6,9,23); // Too many numbers can be pass to the function

    }
    static void varArgs(int ...v){
        System.out.print(Arrays.toString(v));
    }
}
