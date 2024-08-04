/* Arrays as Functioin argument */

public class ArrayasFunctionargument {
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int nonChangeable = 5;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);

        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }

    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 10;
        for(int i =0; i<marks.length;i++){
            marks[i] = marks [i] + 1;
        }
    }
}
