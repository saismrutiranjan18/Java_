import java.util.*;

public class Inbuilt {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        printArr(arr);
    }
    
    public static void printArr(int arr[]) {
        for(int i = 0 ; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
