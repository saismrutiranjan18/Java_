/* 0-1 Triangle Pattern */

    public class OTrianglePattern {
    public static void main(String[] args) {
        floydTriangle(5);
    }

    public static void floydTriangle(int n) {
        //outer loop 
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
