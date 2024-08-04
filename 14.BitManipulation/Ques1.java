/*Ques1 . Check if odd or even */

public class Ques1 {
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(8);
    }

    public static void oddOrEven(int n) {
        int bitMask = 1 ;
        if((n & bitMask) == 0){
            //even number
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
