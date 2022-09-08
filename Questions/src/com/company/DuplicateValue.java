package com.company;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValue {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 5, 6, 56, 33, 3};

        System.out.println("Method 1 :- Using Nested For Loop");
        boolean ans = method1(nums);
        System.out.println(ans);

        System.out.println("\nMethod 2 :- Using HashSet");

        boolean ans2 = method2(nums);
        System.out.println(ans2);
    }

    public static boolean method1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean method2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int j : nums) {
            if (!set.add(j)) {
                return true;
            }
        }
        return false;
    }
}