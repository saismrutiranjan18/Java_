public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
    
    }

class Student {
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called");
    }
}