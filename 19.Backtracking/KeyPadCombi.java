/* Keypad Combinations
Given a string containing digits from 2-9 inclusive, print all possible letter combinations that
the number could represent. You can print the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1
does not map to any letters.

Sample Input 1 : digits = "23"
Sample Output 1 : "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
Sample Input 2 : digits = "2"
Sample Output 2 : "a", "b", "c"
Sample Input 3 : digits = ""
Sample Output 3 : ””


 */

 public class KeyPadCombi {

    final static char[][] L = {
        {},               // 0
        {},               // 1
        {'a', 'b', 'c'},  // 2
        {'d', 'e', 'f'},  // 3
        {'g', 'h', 'i'},  // 4
        {'j', 'k', 'l'},  // 5
        {'m', 'n', 'o'},  // 6
        {'p', 'q', 'r', 's'}, // 7
        {'t', 'u', 'v'},  // 8
        {'w', 'x', 'y', 'z'}  // 9
    };

    public static void letterCombinations(String D) {
        int len = D.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), D);
    }

    public static void bfs(int pos, int len, StringBuilder sb, String D) {
        if (pos == len) {
            System.out.println(sb.toString());
            return; // Add return to stop further recursion
        }

        char[] letters = L[Character.getNumericValue(D.charAt(pos))];
        for (int i = 0; i < letters.length; i++) {
            sb.append(letters[i]);
            bfs(pos + 1, len, sb, D);
            sb.setLength(sb.length() - 1); // Backtrack by removing last character
        }
    }

    public static void main(String[] args) {
        letterCombinations("2");
    }
}
