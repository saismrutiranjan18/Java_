/* Print numbers from 1 to n */

import java.util.Scanner;

public class example3While {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number : ");
        int counter = 1;
        int range = sc.nextInt();

        while(counter<=range){
            System.out.print(counter + " ");
            counter ++;
        }
        System.out.println();
    }
}
