package com.company;
public class Profit {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int ans = findProfit(arr);
        System.out.println(ans);
    }

    public static int findProfit(int[] arr) {
        int op = 0; //* overall profit
        int lsf = Integer.MAX_VALUE; //* Least so far
        int pist ; //* Profit if sold today

        for (int j : arr) {
            if (j < lsf) {
                lsf = j;
            }
            pist = j - lsf;
            if (op < pist) {
                op = pist;
            }
        }

        return op;
    }
}
