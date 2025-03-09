import java.util.*;

public class InsertinHeap{

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){ //O(logn)
            //add data to the end of the array
            arr.add(data);
            
            int x = arr.size() - 1; //x is child index
            int par = (x - 1) / 2; //par is parent index

            while(arr.get(x) < arr.get(par)){ //O(logn)
                //swap the elements
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}