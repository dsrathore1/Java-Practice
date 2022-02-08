package com.company._24TwentyFourthDay;

public class Bit_Manipulation1 {
    public static void main(String[] args) {
        //? Find the only non-repeating element in an array where every repeat twice?
        int[] a = {5, 4, 1, 4, 3, 5, 1, 3, 9};
        int res = 0;
        for (int i : a) {
            res = res ^ i;
        }
        System.out.println(res);
    }
}
