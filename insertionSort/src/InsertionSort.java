import java.util.ArrayList;

public class InsertionSort {

    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    ArrayList<Integer> test(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> arrOut = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            arrOut.add(arr[i]);

        return arrOut;
    }

    void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

}
