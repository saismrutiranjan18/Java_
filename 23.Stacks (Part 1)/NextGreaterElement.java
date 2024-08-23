/* Iss question ke many form jo aa sakte hai 
E.g.  

1. next Greater Right
2. next Greater left -> loop interchange hint
3. next Smaller Right -> while condition ko reverse kar do <= se >= hint
4. next Smaller Left -> loop reverse + while condition change hint

*/
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //1. while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            //2. if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1; 
            }else{
                nxtGreater[i] = arr[s.peek()];
            }

            //3. push in stack
            s.push(i);
        }

        for(int i = 0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i]+ " ");
        }
        System.out.println();
    }
}
