package com.company._28TwenthEightDay;

//* Try and Catch
/*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
You call a pre-defined API int guess(int num), which returns three possible results:

        -1: Your guess is higher than the number I picked (i.e. num > pick).
        1: Your guess is lower than the number I picked (i.e. num < pick).
        0: your guess is equal to the number I picked (i.e. num == pick).
        Return the number that I picked.
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 13, 45, 67, 87};
        int target = 9;

        int gtn = guessTheNumber(arr, target);
        System.out.println(gtn);

    }
    public static int guessTheNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
/* LeetCode Solution
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int guessValue = guess(mid);
            if (guessValue == 0) {
                return mid;
            } else if (guessValue == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
*/