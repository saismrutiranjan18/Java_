/* Inverted Half-Pyramid with numbers Pattern */

public class InvertedHPNumbers {
    public static void main(String[] args) {
        invertedHPNumbers(5);
    }

    public static void invertedHPNumbers(int n) {
        
        //outer loop 
        for(int i=1; i<=n; i++){
            //inner-numbers
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
