package com.company._30DayThirty;

public class PrintNumber {
    public static void main(String[] args) {
        int num = 10;
        //* Print N to 1 given number
        int ans = printNTo1(num);
        System.out.println(ans);

        //* Print 1 to N given number
        System.out.print("1 ");
        print1ToN(num);
    }

    public static void print1ToN(int num) {
        if (num == 1 || num == 0) {
            return;
        }

        print1ToN(num - 1);
        System.out.print(num + " ");
    }

    public static int printNTo1(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        System.out.print(num + " ");
        return printNTo1(num - 1);
    }
}
