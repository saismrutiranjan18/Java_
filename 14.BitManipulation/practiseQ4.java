/* This question is based on a trick, please directly look at the solution.
Convert uppercase characters to lowercase using bits */

public class practiseQ4 {
        public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
        System.out.println((char)(ch | ' '));
        // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
        

