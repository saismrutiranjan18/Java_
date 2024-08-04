/* Print X^n (Optimized) */

public class XnOptimized {
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(xPowOptimize(2,10));
    }

    public static int xPowOptimize(int a, int n) {
        if ( n == 0 ){
            return 1;
        }
        int halfPower = xPowOptimize (a,n/2);
        int halfPowerSq = halfPower * halfPower;

        // n  is odd
        if(n%2!=0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
        
    }    
}
