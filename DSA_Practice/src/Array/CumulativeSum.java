package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class CumulativeSum {

    //* This is my approach!! TC = O(n) SC = O(n^2)
    public static int[] sum(int[] arr) {
        int temp = 0;
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            temp += arr[i] ;
            arr2.add(temp);
        }
        //? It will convert ArrayList to Array
        return arr2.stream().mapToInt(i -> i).toArray();
    }

    //* Optimal approach TC = O(n) SC = O(1)
    public static int[] sum2(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("This is my approach to solve this question:-\n" + Arrays.toString(sum(arr)));

        System.out.println("\nOptimal approach:-\n" + Arrays.toString(sum2(arr)));
    }
}
