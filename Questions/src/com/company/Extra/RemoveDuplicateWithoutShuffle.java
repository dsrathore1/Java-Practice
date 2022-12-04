package com.company.Extra;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateWithoutShuffle {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int j : nums) {
            hs.add(j);
        }
        System.out.print(hs + " ");

        int[] arr1 = new int[hs.size()];
        int i = 0;
        for (int m : hs) {
            arr1[i++] = m;
        }
        Arrays.sort(arr1);
        System.out.println(" ");

        System.out.print(Arrays.toString(arr1) + " ");
        System.out.print("\nElements present are :- ");
        return i;
    }

    public static int method2(int[] nums) {
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 5, 6, 7, 8, 9, 2, 2, 2, 1, 22, 43, 55};
        int ans = removeDuplicates(arr);
        System.out.println(ans);

        int ans2 = method2(arr);
        System.out.println(ans2);
    }
}
