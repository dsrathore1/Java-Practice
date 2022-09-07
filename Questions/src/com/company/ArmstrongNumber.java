package com.company;

public class ArmstrongNumber {
    public static boolean isArmstrong(int x) {
        int originalNo = x;
        int count = 0;
        int temp = x;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int sumOfPower = 0;
        while (x != 0) {
            int digit = x % 10;
            sumOfPower += Math.pow(digit, count);
            x /= 10;
        }
        return sumOfPower == originalNo;
    }

    public static void main(String[] args) {
//        Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some Armstrong Numbers.

        int num = 1503;

        if (isArmstrong(num)) {
            System.out.println("Yes, It is an armstrong number");
        } else {
            System.out.println("No, It is not an armstrong number");
        }
    }
}
