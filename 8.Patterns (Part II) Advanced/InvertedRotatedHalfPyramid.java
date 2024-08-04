/* Inverted Half Rotated Half Pyramid Pattern */

public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        InvertedRotatedHalfPyramid(5);
    }

    public static void InvertedRotatedHalfPyramid(int n) {
        
        //outer loop 
        for(int i=1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
                System.out.println(" ");
        }
    }
}
