package com.company;

import java.util.Scanner;

public class _9NinthDay {
    public static void main(String[] args) {
        /*Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.*/

        Scanner scan = new Scanner(System.in);

//        int i = 1;
//        while (scan.hasNext()) {
//            String s = scan.nextLine();
//            if (s == "") {
//                return;
//            }
//            System.out.println(i + " " + s);
//            i++;
//        }

        /*
Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3

Sample output 1

3

Sample input 2

-1
2

Sample output 2

java.lang.Exception: Breadth and height must be positive*/
        int b = scan.nextInt();
        int h = scan.nextInt();
        if (b >= 1 && h >= 1) {

            // The area of parallelogram

            int area = b * h;

            // Printing the area of parallelogram
            System.out.println("The area of parallelogram is (area = breath * height) :- " + area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}