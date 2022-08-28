package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class CheckArray {
    public static int isEqual(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        if (m != n) {
            return 0;
        }
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (hm.get(arr1[i]) == null) {
                hm.put(arr1[i], 1);
            } else {
                count = hm.get(arr1[i]);
                count++;
                hm.put(arr1[i], count);
            }
        }

        for (int j = 0; j < n; j++) {
            if (!hm.containsKey(arr2[j])) {
                return 0;
            }
            if (hm.get(arr2[j]) == 0) {
                return 0;
            }
            count = hm.get(arr2[j]);
            --count;
            hm.put(arr2[j], count);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println("Enter your array1 elements :- ");
        int[] arr1 = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter your array1 elements :- ");

        int[] arr2 = new int[N];
        for (int j = 0; j <= N - 1; j++) {
            arr2[j] = sc.nextInt();
        }

        int ans = isEqual(arr1, arr2);
        System.out.println(ans);
    }
}
