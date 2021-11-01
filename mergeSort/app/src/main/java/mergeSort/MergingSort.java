package mergeSort;

import java.util.ArrayList;

public class MergingSort {
    static void mergeSort(int arr[]) {

        int n = arr.length;

        if (n > 1) {
            int mid = n / 2;
            int left[] = new int[mid];
            int right[] = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];

            }

            for (int i = 0; i < (n - mid); i++) {
                right[i] = arr[mid + i];
            }

            mergeSort(left);
            mergeSort(right);

            merge(left, right, arr);

        }

    }

    static void merge(int left[], int right[], int arr[]) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        if (i == left.length) {
            for (int rem = k; rem < arr.length; rem++, j++) {
                arr[rem] = right[j];
            }
        } else {
            for (int rem = k; rem < arr.length; rem++, i++) {
                arr[rem] = left[i];
            }
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static ArrayList<Integer> testArray(int arr[]) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i)
            output.add(arr[i]);

        return output;
    }

}
