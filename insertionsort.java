import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        insertionSort(arr);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}