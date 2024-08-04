/* Fibonacci series */

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = 1; 
            int b = 1;
            int n = sc.nextInt();
            System.out.print(a);
            System.out.print(b);

            for(int i = 3; i<=n; i++){
                int temp = a;
                a = b;
                b = temp+b;
                System.out.print(b);
        }
    }
}
