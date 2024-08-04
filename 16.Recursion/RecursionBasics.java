/* Problem 1 - Print number in decreasing order from n to 1 */

public class RecursionBasics {
    public static void main(String[] args) {
        int n= 10;
        printDec(n);
    }

    public static void printDec(int n) {
        if(n==1){
        System.out.println(n);
        return;
        }
        System.out.print(n + " ");
        printDec(n-1);
       
    }
}