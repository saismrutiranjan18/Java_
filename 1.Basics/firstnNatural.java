/*Sum of first n Natural Number */

public class firstnNatural {
    public static void main(String[] args) {
        int n = 5;
        int value = 1;
        int sum = 0;

        while(value<=n){
            sum = sum +value;
            value = value + 1 ;
        }
        System.out.println(sum);
    }
}
