/* Print X^n */

public class Xtothepowern {
    public static void main(String[] args) {
        System.out.println(xPow(2,10));
    }

    public static int xPow(int x, int n) {
        if ( n == 0 ){
            return 1;
        }
        int xnm1 = xPow(x, n-1);
        int xn = x * xnm1;
        return xn;
    }    
}


