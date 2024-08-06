/* Give a "2*n" floor and tiles of size "2*1", count the number of ways to tile the given board using the 2*1 tiles 
 * ( - tiles can either be placed horizontally or vertically)
 */

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }

    public static int tilingProblem(int n) {//2*n (floor size)
        
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        
        return totWays;

        /* This small statement also implement the same that above variable do 
        above is for understanding and below is for shorten the code
        
        return tilingProblem (n-1) + tilingProblem(n-2);
         
        */
    }
}
