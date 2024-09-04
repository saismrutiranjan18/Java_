import java.util.*;

public class ActivitySelection{
    public static void main(String[] args){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(0);
        int LastEnd = end[0];

        for(int i = 1; i<end.length; i++){
            if(start[i] >= LastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                LastEnd = end[i];
            }
        }
        System.out.println("max activities = " +maxAct);

        for(int i=0; i<ans.size(); i++){
            System.out.print("A" +ans.get(i) + " ");
        }
        System.out.println();
    }
}