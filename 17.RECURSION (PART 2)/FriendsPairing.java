/* Give n friends, each one can remain s ingle or can b e paired up with same other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up
 */


 public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }

    public static int friendPairing(int n) {//2*n (floor size)
      
        //base case
        if(n==1 || n==2){
            return n;
        }

        //choice
        //single
        int fnm1 = friendPairing(n-1);

        //pair
        int fnm2 = friendPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        int totWays = fnm1 + pairWays;
        return totWays;

        /*This small statement also implement the same that above variable do 
        above is for understanding and below is for shorten the code
        
        return friendPairing (n-1) + (n-1) * friendPairing(n-2);
         */
        
    }
}

