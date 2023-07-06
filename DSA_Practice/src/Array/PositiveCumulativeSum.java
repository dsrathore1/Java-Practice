package Array;

import java.util.ArrayList;
import java.util.List;

public class PositiveCumulativeSum {
    //? This is my approach to solve this problem TC = O(n) [The positive cumulative sum of an array is a list of only those cumulative sums which are positive.]
    public static List<Integer> getPositiveSum(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
            if (sum > 0) {
                al.add(sum);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -6};
        System.out.println("Positive Cumulative Sum:-\n" + getPositiveSum(arr));
    }
}
