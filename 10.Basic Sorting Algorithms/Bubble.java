public class Bubble{
    public static void main (String[] args){
        int arr[]= {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
    public static void bubbleSort(int arr[]) {
        int n = arr.length-1;
        for(int i = 0 ; i<n; i++){
            for( int j = 0 ; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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