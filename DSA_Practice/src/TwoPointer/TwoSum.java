package TwoPointer;

import java.util.Arrays;

public class TwoSum {
    public static int[] sumOfPair(int[] arr, int target) {
        Arrays.sort(arr);
        int pointerOne = 0;
        int pointerTwo = arr.length - 1;

        while (pointerOne < pointerTwo) {
            int sum = arr[pointerOne] + arr[pointerTwo];

            if (sum < target) {
                pointerOne++;
            } else if (sum > target) {
                pointerTwo--;
            } else {
                return new int[]{arr[pointerOne], arr[pointerTwo]};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 11};
        int target = 10;

        int[] ans = sumOfPair(arr, target);
        System.out.println(Arrays.toString(ans));

    }
}
