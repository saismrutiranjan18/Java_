/* Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321. */

import java.util.Scanner;

public class Prac3 {
    public static void main(String args[]) {
    System.out.println("Please Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int palindrome = sc.nextInt();
    if(isPalindrome(palindrome)) {
    System.out.println("Number : " + palindrome + " is a palindrome");
    } else {
    System.out.println("Number : " + palindrome + " is not a palindrome");
    }
}

    public static boolean isPalindrome(int number) {
    int palindrome = number; // copied number into variable
    int reverse = 0;
    while (palindrome != 0) {
    int remainder = palindrome % 10;
    reverse = reverse * 10 + remainder;
    palindrome = palindrome / 10;
    }
    // if original and the reverse of number is equal means
    // number is palindrome in Java
    if (number == reverse) {
    return true;
}
    return false;
    }
}
