/* Floyd Triangle Pattern */

public class FloydsTrianglePattern {
    public static void main(String[] args) {
        floydTriangle(5);
    }

    public static void floydTriangle(int n) {
        int counter = 1;
        //outer loop 
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
