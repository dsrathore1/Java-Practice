package com.company;

public class RemoveDuplicate {
    public static int removeElement(int[] arr, int elem) {
        int pointer = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] != elem) {
                arr[pointer++] = arr[i];
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 1, 4, 7, 4};
        int elem = 1;
        int removeElement = removeElement(arr, elem);
        System.out.println(removeElement);
    }
}
