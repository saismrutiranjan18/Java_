/* Find & Print all subsets of a given string "abc" */

public class FindSubsets {
    
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }

    public static void findSubsets( String str, String ans, int i) {
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        //recursion

        //Yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);

        //No Choice
        findSubsets(str, ans, i+1);
    }
}
