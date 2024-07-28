/*Sum of two Numbers*/

import java.util.Scanner;

public class sumOf2num {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The Sum of two number is : " +sum);
    }
}