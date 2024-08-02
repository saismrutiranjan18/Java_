public class Swappingtwono {
    public static void main(String[] args) {
        int a = 15 ;
        int b = 10;
        swap (a, b);
    }

    public static void swap(int a , int b) {
        int temp = a;
        a = b; 
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
