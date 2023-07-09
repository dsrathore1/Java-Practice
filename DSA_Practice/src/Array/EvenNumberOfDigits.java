package Array;

import java.util.ArrayList;
import java.util.List;

//! Given an array of integer, find the element which have an even number of digits.
//? NOTE:- Order of return elements should be same as order of initial array.
public class EvenNumberOfDigits {

    //* This approach use String to find the digit in given element by first convert element into String and after that it count the length of the element.
    public static List<Integer> evenDigitFunc(int[] arr) {
        List<Integer> evenDigit = new ArrayList<>();
        for (int i : arr) {
            String numString = String.valueOf(i);
            if (numString.length() % 2 == 0) {
                evenDigit.add(i);
            }
        }
        return evenDigit;
    }

    //* More optimize solution
    public static List<Integer> evenDigitFunc2(int[] arr) {
        List<Integer> digit = new ArrayList<>();

        for (int num : arr) {
            int digitCount = 0;
            int temp = num;

            while (temp != 0) {
                temp /= 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) {
                digit.add(num);
            }
        }

        return digit;
    }

    public static void main(String[] args) {
        int[] arr = {11, 42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};
        List<Integer> evenDigit = evenDigitFunc(arr);
        System.out.println("String approach :-\n" + evenDigit);

        List<Integer> evenDigit2 = evenDigitFunc2(arr);
        System.out.println("Without String approach :-\n" + evenDigit2);
    }
}
