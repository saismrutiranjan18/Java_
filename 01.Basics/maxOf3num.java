/*Calculate Max. of three number */

import java.util.Scanner;

public class maxOf3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Maximum of 3 Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("A is greatest : " +a);
            }else {
                System.out.println("C is greatest : " +c);
            }
        }else{
            if(b>c){
                System.out.println("B is greatest : " +b);
            }else {
                System.out.println("C is greatest : " +c);
            }
        }
    }
}