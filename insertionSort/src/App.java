import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr1[] = { 8, 4, 23, 42, 16, 15 };

        int reverse_sorted[] = { 20, 18, 12, 8, 5, -2 };
        int few_uniques[] = { 5, 12, 7, 5, 5, 7 };
        int early_sorted[] = { 2, 3, 5, 7, 13, 11 };

        insertion(arr1);
        insertion(reverse_sorted);
        insertion(few_uniques);
        insertion(early_sorted);
    }

    public static ArrayList<Integer> insertion(int arr[]) {

        InsertionSort numbers = new InsertionSort();
        numbers.sort(arr);
        numbers.print(arr);
        return numbers.test(arr);
    }

}
