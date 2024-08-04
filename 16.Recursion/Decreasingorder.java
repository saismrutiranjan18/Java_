 /* Problem 2 - Print number in increasing order from 1 to n */

public class Decreasingorder {
    public static void main(String[] args) {
        int n= 10;
        printInc(n);
    }

    public static void printInc(int n) {
        if(n==1){
        System.out.print(n+ " ");
        return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
}

