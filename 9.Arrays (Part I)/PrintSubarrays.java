/* Print Sub-arrays */

public class PrintSubarrays {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }

    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = 1; j<numbers.length; j++){
                int end = j; 
                int sum = 0;
                for(int k=start; k<=end; k++){
                    //print subarrays
                    System.out.print(numbers[k]+ " ");
                    sum+=numbers[k];
                }
                ts++;
                System.out.println("sum:" +sum);
            }
            System.out.println();
        }
        System.out.println("total subarrays = " +ts);
    }
}
