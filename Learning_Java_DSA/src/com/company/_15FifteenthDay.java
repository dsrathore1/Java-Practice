package com.company;

public class _15FifteenthDay {
    public static void main(String[] args) {
        // Insertion Sort
        int[] a = {2, 15, 6, 8, 12, 87, 1};
        int temp, i, j;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            j = i;
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}

class FindMinMax {
    // Find the min and max into the given array
    public static void main(String[] args) {
        int[] arr1 = {2, 15, 6, 8, 12, 87, 1};

        for (int i = 1; i < arr1.length; i++) {
            int temp = arr1[i];
            int j = i;
            while (j > 0 && arr1[j - 1] < temp) {
                arr1[j] = arr1[j - 1];
                j = j - 1;
            }
            arr1[j] = temp;
        }


        System.out.println("Your array after insertion sort");
        // Print the array
        for (int l : arr1) {
            System.out.print(l + " ");
        }

        // Reverse order of the array
        System.out.println("\n\nReverse order of the array");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n\nYour maximum value of the array is :- " + arr1[0]);
        // Finding the minimum value with bubble sort
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        System.out.println("\nYour array after bubble sort");
        for (int l : arr1) {
            System.out.print(l + " ");
        }

        System.out.println("\n\nYour minimum value of the array is :- " + arr1[0]);

    }
}

/*

array = {2, 15, 6, 8, 12, 87, 1};

for loop {
    Step : 1
i = 1;
temp  = 5;
j = 1;


while loop {
(1 > 0 -- true and arr1[1-1] > temp;)--temp = 5 & arr1[0] = 2; 2 > 5 = false; then condition not satisfied;
}
while loop abort;

array after loop : {2, 15, 6, 8, 12, 87, 1}

    Step : 2

i = 2;
temp = a[i] -- a[i] = a[2] = 6;
j = 2;

while loop {
    --condition checking
(2 > 0 and a[2-1] > temp) --a[1] = 15; temp = 6; so, 15 > 6 = true; Condition satisfied

a[j-1] = a[j]; --a[2] = 6 swap with a[1] = 15; So now, a[1] = 6 and a[2] = 15;

Now,

j = j - 1, while loop check j > 0 = true; while loop again run until condition get false

Then, after while loop completed
a[j] = temp; -- a[j] =
Hence, array is now { 2, 6, 15, 8, 12, 87, 1}

so on... step will occur and check conditions until for loop get over
}
}


*/