/*To check the largest number of 3  */

public class largestof3 {
    public static void main(String[] args) {
        int A = 1 , B  = 2 , C = 3;

        if((A>=B) && (A>=C)){
            System.out.println("A");
        }else if (B>=C){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
    }
}
