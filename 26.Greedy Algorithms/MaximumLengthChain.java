import java.util.*;

public class MaximumLengthChain {
    public static void main(String[] args) {
        int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        // Corrected Comparator using lambda expression
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        
        int chainLen = 1;
        int pairEnd = pairs[0][1]; // Last selected pair end

        for(int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > pairEnd) {
                chainLen++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println("max length of chain = " + chainLen);
    }
}
