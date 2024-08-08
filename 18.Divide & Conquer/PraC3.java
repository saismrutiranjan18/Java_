/* Given an array of integers. Find the Inversion Count in the array. (HARD)
Inversion Count: For an array, inversion count indicates how far (or close) the array is from
being sorted. If the array is already sorted then the inversion count is 0. If an array is
sorted in the reverse order then the inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
Sample Input 1 : N = 5, arr[ ] = {2, 4, 1, 3, 5}
Sample Output 1 : 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3). saismrutiranjan1810@gmail.com
Sample Input 2 : N = 5, arr[ ] = {2, 3, 4, 5, 6}
Sample Output 2 : 0, because the array is already sorted
Sample Input 3 : N = 3, arr[] = {5, 5, 5}
Sample Output 3 : 0, because all the elements of the array are the same & already in a sorted
manner.
(Hint : A sorting algorithm will be used to solve this question.)
Note - This question is important. Even if you are not able to come up with the approach,
please understand the solution. */

public class PraC3 {
        public static int getInvCount(int arr[]) {
        int n = arr.length;
        int invCount = 0;
        for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
        invCount++;
        }
        }
        }
        return invCount;
        }
        public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Inversion Count = "+ getInvCount(arr));
    }
}

