public class clearlastiBit {

    public static int updateithBit(int n , int i) {

        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateithBit(15,2));
    }
}
