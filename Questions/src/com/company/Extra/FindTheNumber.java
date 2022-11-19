package com.company.Extra;

public class FindTheNumber {
    public static boolean method1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                System.out.println("The breaking point is between :- " + arr[i - 1] + " and " + arr[i]);
                return false;
            }
        }
        System.out.println(" There is no breaking point in array");
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean ans1 = method1(arr);
        System.out.println(ans1);


    }
}
