/* Calculate Area of a Circle */

import java.util.Scanner;


public class areaofCircle {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter radius : ");
        float r = sc.nextInt();
        float areaofCircle =  3.14f*r*r;
        System.out.println("The Sum of two number is : " +areaofCircle);
    }
}

