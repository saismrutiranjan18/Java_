/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and total cost of the items back to the user as their bill */

import java.util.Scanner;

public class PractiseQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        float pencil = sc.nextInt();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();
        float sum = pencil + pen + eraser;
        System.out.println(sum);
        System.out.println("After adding 18% GST to the total amount "); 
        float gst = (sum*18)/100;
        System.out.println(gst);
        float netPrice = sum + gst;
        System.out.println(netPrice);

    }
}
