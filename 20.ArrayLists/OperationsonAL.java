import java.util.*;

public class OperationsonAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add Element - O(1)
        list.add(1);
        list.add(2); 
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list);

        //Get Element - O(1)
        int element = list.get(2);
        System.out.println(element);

        //Remove Element - O(n)
        list.remove(2);
        System.out.println(list);

        //Set Element at Index - O(n)
        list.set(2,10);
        System.out.println(list);

        //contains Element - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Add in different way - O(n)
        list.add(1,9);

    }
}
