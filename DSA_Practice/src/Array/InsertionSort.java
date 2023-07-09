package Array;

public class InsertionSort {
    public static int[] sorting(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {                                                                               
        int[] arr = {7, 3, 5, 1, 9};
        int[] ans = sorting(arr);

        for (int k : ans) {
            System.out.print(k + " ");
        }

    }
}
