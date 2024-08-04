/* Arrays - Input, Output and Update */

import java.util.Scanner;

public class InputOutputandUpdate {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics : " +marks[0]);
        System.out.println("Chemistry : " +marks[1]);
        System.out.println("Maths : " +marks[2]);

        //update
        marks[2] = 100;
        System.out.println("maths :" +marks[2]);
    }
}
