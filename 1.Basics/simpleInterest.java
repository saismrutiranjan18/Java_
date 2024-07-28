/*Calculate Simple Interest */

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("To find out simple interest : ");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int SI = (p*r*t)/100;
        System.out.println("The Simple Interest of about number is : " +SI);
    }
}