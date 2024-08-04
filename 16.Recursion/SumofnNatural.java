/* Problem 4 - Print Sum of first n natural number */

public class SumofnNatural {
    public static void main(String[] args) {
        int n= 5;
        System.out.println(sumN(n));
    }

    public static int sumN(int n) {
        if(n==1){
        return 1;
        }
        int Snm1 = sumN (n-1);
        int Sn = n + Snm1;
        return Sn; 
    }
}
