import java.util.*;

public class HeapSort {

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest); // Corrected parameter order
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Step 1 - Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) { // Corrected loop range
            heapify(arr, n, i); // Corrected function call
        }

        // Step 2 - Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0); // Corrected function call
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
