package com.company;

import java.util.Scanner;

public class _8EightDay {
    public static void main(String[] args) {
//        1. Two Sum
        /*
    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]
*/
//        code of Example 1


//        code of Example 1

//        2. Java Datatype
        /*
        n can't be fitted anywhere.
        Sample Input

        5
        -150
        150000
        1500000000
        213333333333333333333333333333333333
        -100000000000000
        Sample Output

        -150 can be fitted in:
        * short
        * int
        * long
        150000 can be fitted in:
        * int
        * long
        1500000000 can be fitted in:
        * int
        * long
        213333333333333333333333333333333333 can't be fitted anywhere.
        -100000000000000 can be fitted in:
        * long
*/
//code of example 2
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                //Complete the code
                if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
        sc.close();
    }

//code of example 2

}
