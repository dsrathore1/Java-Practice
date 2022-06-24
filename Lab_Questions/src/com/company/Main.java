package com.company;

class MergeSort {

    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 12, 10, 9, 1};

        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);

        System.out.println();

        System.out.println("Sorted array:");
        printArray(arr);
    }

    void mergeSort(int[] arr, int l, int r) {
        Merge obj = new Merge();
        if (l < r) {

            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            obj.merge(arr, l, m, r);
        }
    }
    static class Merge{
        void merge(int[] arr, int p, int q, int r) {

            int n1 = q - p + 1;
            int n2 = r - q;

            int[] L = new int[n1];
            int[] M = new int[n2];

            System.arraycopy(arr, p, L, 0, n1);
            for (int j = 0; j < n2; j++)
                M[j] = arr[q + 1 + j];

            int i, j, k;
            i = 0;
            j = 0;
            k = p;

            while (i < n1 && j < n2) {
                if (L[i] <= M[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = M[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = M[j];
                j++;
                k++;
            }
        }
    }
}