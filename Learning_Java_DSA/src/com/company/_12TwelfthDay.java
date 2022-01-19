package com.company;

// Bubble Sort

class BubbleSort {
    public static void printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 7, 9, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printing(arr);
    }
}

public class _12TwelfthDay {
    public static void main(String[] args) {
        // Two Sum
//        int[] num = {2, 7, 4, 5, 13, 44, 6, 32, 3};
//        int target = 9;
//
//        for (int i = 0; i < num.length - 1; i++) {
//            for (int j = i + 1; j < num.length; j++) {
//                if (num[i] + num[j] == target) {
//                    int[] ar = {num[i], num[j]};
////                    System.out.println(num[i] + " " + num[j]);
//                    System.out.print(Arrays.toString(ar) + " ");
//                }
//            }
//        }

//        Scanner scan = new Scanner(System.in);
//        int test = scan.nextInt();
//        int i = 0;
//        while (i < test) {
//            System.out.println(i+1);
//            i++;
//        }
    }
}


