package com.company._29TwentyNineDay;

public class DecimalToBinary {
    public static void main(String[] args) {
        String fb = findBinary("", 233);
        System.out.println(fb);
    }

    public static String findBinary(String result, int decimal) {
        if (decimal == 0) {
            return result;
        }
        result = decimal % 2 + result;
        return findBinary(result, decimal / 2); //* 11101001
    }

}
