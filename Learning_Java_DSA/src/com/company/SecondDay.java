package com.company;



public class SecondDay {

    //Functions

    //Product Function
    public static void product(int a, int b){
        int c = a * b;
        System.out.println("The product of two number is " + c);
    }

    //Addition Function
    public static void sumOfTwoNum(int a, int b){
        int c = a + b;
        System.out.println("The sum of two number is " + c);
    }

    public static void subOfTwoNumber(int a, int b){
        int c = b - a;
        System.out.println("The substraction of two number is " + c);
    }

    public static void main(String[] arg){
        int a = 4;
        int b = 5;
        product(a, b);
        sumOfTwoNum(a, b);
        subOfTwoNumber(a, b);
    }
}
