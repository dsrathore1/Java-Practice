package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArr {
    public static int[] sortedArr(int[] A, int[] B) {
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i <= A.length - 1; i++) {
            if (A[i] != 0) {
                C.add(A[i]);
            }
        }
        for (int j = 0; j <= B.length - 1; j++) {
            if (B[j] != 0) {
                C.add(B[j]);
            }
        }

//        Integer[] c = C.toArray(new Integer[0]);
//        Conversion of ArrayList to Array
        int[] c = C.stream().mapToInt(i -> i).toArray();
        Arrays.sort(c);
        return c;
    }

    //* Different approach
    public static int[] sortedArr2(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (j <= arr2.length - 1 && i <= arr1.length - 1) {
            if (arr1[i] < arr2[j] && arr1[i] != 0 && arr2[j] != 0) {
                res[k] = arr1[i];
                i++;
                k++;
            } else {
                res[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (j <= arr2.length - 1 && arr1[i] != 0 && arr2[j] != 0) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        while (i <= arr1.length - 1 && arr1[i] != 0 && arr2[j] != 0) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        System.out.println("\n");
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 0, 0, 0};
        int[] B = {2, 5, 6};
        System.out.print(Arrays.toString(sortedArr(A, B)));

        System.out.print(Arrays.toString(sortedArr2(A, B)));

    }
}
