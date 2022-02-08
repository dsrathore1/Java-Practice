package com.company._24TwentyFourthDay;

public class Bit_Manipulation2 {
    public static void main(String[] args) {
        //? Find the two non-repeating elements in an array where every element repeat twice?
        int[] a = {5, 4, 1, 4, 3, 5, 1, 2};
        int res = 0;

        for (int i : a) {
            res = res ^ i;
        }

        res = res & (-res);

        int sum1 = 0;
        int sum2 = 0;


        for (int j : a) {
            if ((j & res) > 0) {
                sum1 = sum1 ^ j;
            } else {
                sum2 = sum2 ^ j;
            }
        }
        System.out.print(sum1 + " " + sum2);
    }
}
