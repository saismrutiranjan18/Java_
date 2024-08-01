/* Sum of first N natural number */

import java.util.Scanner;

public class example4While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(" sum is : " +sum);
    }
}
