import java.util.Scanner;

public class PractiseQ {
   /* Q.1 public static void main(String[] args) {
        int arr[] []={{4,7,8}, {8,8,7}};
        sevenCount(arr);

         public static void sevenCount(int arr[][]) {
        int count = 0;
        int tar= 7;
        for (int i = 0; i<arr.length; i++){
            for (int j = 0;j< arr[0].length; j++){
                if (arr[i][j]==tar){
                    System.out.println(i +"," +j);
                    count ++;
                }                        
            }
       
        }
             System.out.println(count);
    }

    }
 Q.2
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();
       int arr[][]= new int [rows][cols];

   
        for(int i = 0; i<rows; i++){
            for (int j = 0 ; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        //take the sum of all elements in 2nd row
        for(int j= 0;j<cols; j++){
            sum= sum+arr[1][j];
        }

        System.out.println("Sum of second row : "+sum);
    }
   
Q.3
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int arr[][]= new int [rows][cols];

    for(int i = 0; i<rows; i++){
        for (int j = 0 ; j<cols; j++){
            arr[i][j] = sc.nextInt();
        }
    }

    int transpose[][] = new int [cols][rows];

    for(int i = 0; i<rows; i++){
        for (int j = 0 ; j<cols; j++){
          transpose[j][i] = arr[i][j];
        }
    }
System.out.println("Transpose Matrix");
    for(int i = 0; i<cols; i++){
        for (int j = 0 ; j<rows; j++){
          System.out.println(transpose[i][j] + "");
        }
      
     }
     System.out.println();
    }
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][]= new int [rows][cols];
    
        for(int i = 0; i<rows; i++){
            for (int j = 0 ; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int i = 0;
        int j = cols-1;

        int target = sc.nextInt();

        while(i<rows && j>=0){
            if(arr[i][j] == target){
                System.out.println("element found at " +i +"," +j);
                break;
            }
            else if(arr[i][j] < target){
                i++;
            }
            else if(arr[i][j] > target){
                j--;
            }
        }
    }
}
