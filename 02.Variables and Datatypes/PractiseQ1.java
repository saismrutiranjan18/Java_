/*In a program, input 3 numbes : A, B, and C. You have to output the average of these 3 numbers */

import java.util.Scanner;

public class PractiseQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
}
