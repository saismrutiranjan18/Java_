/*Product of two Numbers*/

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("The Sum of two number is : " +product);
    }
}