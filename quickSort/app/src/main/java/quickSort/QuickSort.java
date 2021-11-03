package quickSort;

import java.util.ArrayList;

    public class QuickSort {


        static int partition(int[] arr, int left, int right) {

            int pivot = arr[right];

            int i = (left - 1);

            for (int j = left; j <= right - 1; j++) {
                if (arr[j] < pivot) {

                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, right);
            return (i + 1);
        }
        static void swap(int[] arr, int i, int low) {
            int temp = arr[i];
            arr[i] = arr[low];
            arr[low] = temp;
        }


        static void quickSort(int[] arr, int left, int right) {
            if (left < right) {
                int pos = partition(arr, left, right);

                quickSort(arr, left, pos - 1);
                quickSort(arr, pos + 1, right);
            }
        }

        static void print(int[] arr, int size) {
            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");

            System.out.println();
        }

        static ArrayList<Integer> test(int arr[]) {
            int n = arr.length;
            ArrayList<Integer> arrOut = new ArrayList<>();
            for (int i = 0; i < n; ++i)
                arrOut.add(arr[i]);

            return arrOut;
        }
    }