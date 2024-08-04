/*Print Largest String */
public class Q3{
    public static void main(String[] args) {
        String fruits [] = {"banana", "guava", "papaya", "banana" ,"apple"};

        String largest = fruits[0];

        for(int i = 1 ; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}