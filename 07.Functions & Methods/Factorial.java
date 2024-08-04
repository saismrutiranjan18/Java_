public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }

    public static int Factorial(int n) {
        int fact = 1;
        for (int i= 1 ; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
}
