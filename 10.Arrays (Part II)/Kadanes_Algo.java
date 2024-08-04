//Kadanes_Algo

public class Kadanes_Algo{
   
    public static void  Kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE; // ms = maximum sum
        int cs = 0;// cs = current sum

        for ( int i=0; i<numbers.length; i++){
            cs = cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("our max sub array sum is : " +ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -2,-3,4,-1,-2,1,5,-3};
        Kadanes(numbers);
    }
}