import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){ //O(n)
            char ch = str.charAt(i);
            if( ch=='(' || ch == '{' || ch == '['){
                // opening
                s.push(ch);
            } else {
                // closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
