/*Bubble Question if the array is already Sorted So,what to do */

public class Bubble2 {
    public static void main (String args[]){
        int arr[]= {1,2,3,4,5};
        bubbleSort(arr);
        printArr(arr);
    }
    public static void bubbleSort(int arr[]) {
        int n = arr.length-1;
        for(int i = 0 ; i<n; i++){
            int swaps =0;
            for( int j = 0 ; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        int n =arr.length;
        for(int i = 0 ; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
