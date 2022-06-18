package com.company;

//? Write a program to swap two values using object reference. Your program should have a swap function

class Operation1 {
    int a = 4;
    int b = 9;

    void swap(Operation1 op1) {
        System.out.println("Before swap value of a = " + op1.a + " value b = " + op1.b);
        int temp = op1.a;
        op1.a = op1.b;
        op1.b = temp;
        System.out.println("After swap value of a = " + op1.a + " value b = " + op1.b);
    }
}

public class SwapTheTwoValues {
    public static void main(String[] args) { //! Class containing main method
        Operation1 op2 = new Operation1();
        op2.swap(op2);
    }
}
