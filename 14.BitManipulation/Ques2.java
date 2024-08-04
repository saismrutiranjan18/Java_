public class Ques2 {
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(8));
    }

    public static boolean isPowerofTwo(int n) {
        return ( n & (n-1))==0;
    }
}
