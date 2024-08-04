/* Binary Search */

public class BinarySearch {
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,14,16};
        int key = 10;

        System.out.println("index of key is " +binarySearch(numbers,key));
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0 , end = numbers.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            //comparisons
            if(numbers[mid]==key){ //found
                return mid;
            }
            if(numbers[mid]<key){ //right
                start= mid+1;
            }else{ //left
                end = mid-1;
            }
        }
        return -1;
    }
}
