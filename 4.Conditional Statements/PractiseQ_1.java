/*Write a Java program to get a number from the user and print whether it is
positive or negative. */

import java.util.*;

public class PractiseQ_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some number to know +ve or -ve : ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("It is a Positive Number");
        }else {
            System.out.println("It is a Negative Number");
        }
    }
   
}

