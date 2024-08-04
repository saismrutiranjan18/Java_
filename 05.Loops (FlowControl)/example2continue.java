/* Display all numbers entered by user except multiples of 10 */

import java.util.*;

public class example2continue {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        do{
            System.out.print("enter your number : ");
            int n = sc.nextInt();

            if(n%10 == 0){
                continue;
            }
            System.out.println("number was :" +n);
        }while(true);
    }
}
