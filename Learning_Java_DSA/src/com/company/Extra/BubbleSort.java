package com.company.Extra;


public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 65, 25, 24, 77, 88};
        ascendingOrder(a);
    }

    static void ascendingOrder(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort :- ");
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}
