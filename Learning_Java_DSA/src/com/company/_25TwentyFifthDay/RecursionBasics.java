package com.company._25TwentyFifthDay;

public class RecursionBasics {
    public static void main(String[] args) {

        /*
        ! How to understand & approach a problem?
            * Identify the problem and divided into sub parts or as I say in smaller parts
            * Write the recurrence relation if needed
            * About the tree:
                ? See the flow of the function, how they are getting stack
                ? Identify & focus on left trees and right trees calls

    ! Note :- Draw the tree and position again and again using pen and paper & use debugger to see the internal what process is happening!!!!
            * See how the value are returned at each step see where the function call with come out. In the end, you will come out of the function

                                    ! Most Important
            * 1 Argument - The values/variables which we want to pass into another recursive call put it into the argument. eg:- Binary search's start & end index is needed for next function call

            * 2 Return type

            * 3 Body of function - The value/variable which did not require for the next recursive call they all remain into the body. eg:- Binary search's mid element.

            ? Q1 - Binary search using recursion

        */

        //* Print the fibonacci number
        int ans = fib(4);
        System.out.println(ans);

        //* Print the Target element in BS
        int[] a = {1, 4, 6, 7, 34, 67, 78};
        int target = 34;
        System.out.println(search(a, target, 0, a.length - 1));
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int search(int[] a, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (a[mid] == target) {
            return mid;
        }
        if (target < a[mid]) {
            return search(a, target, start, mid - 1);
        }
        return search(a, target, mid + 1, end);
    }

}
