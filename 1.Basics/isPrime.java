/*Find if a number isPrime or not */

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Check if a number isPrime: ");
        int n = sc.nextInt();

        // Special cases
        if (n <= 1) {
            System.out.println("NOT PRIME");
            return;
        }

        boolean isPrime = true;
        int div = 2;

        while (div <= Math.sqrt(n)) { // Using Math.sqrt to optimize the loop
            if (n % div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }

        if (isPrime) {
            System.out.println("PRIME");
        } else {
            System.out.println("NOT PRIME");
        }
    }
}


