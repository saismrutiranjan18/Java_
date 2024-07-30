/* Shortest Path
 * Give a route containing 4 directions ( E , W, N, S), find the shortest path to reach the destination.
 * "WNEENESENNN"
 */

public class Q2 {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }

    public static float shortestPath(String path) {
        int x = 0 , y = 0;

        for(int i = 0 ; i< path.length(); i++){
            char direction = path.charAt(i);

            //South
            if(direction=='S'){
                y--;
            }
            //North
            else if(direction =='N'){
                y++;
            }
            //East
            else if(direction == 'E'){
                x++;
            }
            //West
            else {
                x--;
            }
        }
            int X2 = x*x;
            int Y2 = y*y;

            return(float)Math.sqrt(X2+Y2);
        }
    }
