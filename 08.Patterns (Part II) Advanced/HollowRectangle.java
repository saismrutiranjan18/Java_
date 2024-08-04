/* Hollow Rectangle Pattern */

public class HollowRectangle {
    public static void main(String[] args) {
        hollowRectangle(4,10);
    }

    public static void hollowRectangle(int row, int col) {
        
        //outer loop 
        for(int i=1; i<=row; i++){
            // inner loop
            for(int j = 1; j<=col; j++){
                if( i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
