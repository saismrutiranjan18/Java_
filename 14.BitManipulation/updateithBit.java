public class updateithBit {

    public static int clearithBit(int n , int i) {
        
        int bitMask = ~(1 << i);
        return  n & bitMask;
    }
    
    public static int updateithBit(int n , int i, int newBit) {

        n = clearithBit ( n, i);
        int bitMask = newBit << i;
        return n | bitMask; 
    }

    public static void main(String[] args) {
        System.out.println(updateithBit(10,2,1));
    }
}
