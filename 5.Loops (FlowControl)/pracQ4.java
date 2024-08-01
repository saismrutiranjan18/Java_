/* Write a program to print the multiplication table of a number N, entered by the
user.
 */

import java.util.*;

public class pracQ4 {
    public static void printMultiplicationTable(int number){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    for(int i=1; i<=10; i++) {
    System.out.println(n + " * " + i + " = " + n*i);
    }
}
    public static void main(String s[]) {
    printMultiplicationTable(5);
    }
}

