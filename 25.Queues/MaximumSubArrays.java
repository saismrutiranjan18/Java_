import java.util.Deque;
import java.util.LinkedList;

public class MaximumSubArrays {
    static void printMax(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int i;

        // Process the first k elements (the first window)
        for (i = 0; i < k; ++i) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        // Process the rest of the elements
        for (; i < n; ++i) {
            // Print the maximum of the previous window
            System.out.print(arr[dq.peek()] + " ");

            // Remove elements that are out of this window
            while (!dq.isEmpty() && dq.peek() <= (i - k)) {
                dq.removeFirst();
            }

            // Remove elements that are smaller than the current element
            // from the back of the deque
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }

            // Add the current element at the back of the deque
            dq.addLast(i);
        }

        // Print the maximum of the last window
        System.out.print(arr[dq.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2};
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
