public class copyConstructor {
    Student s1 = new Student();
    
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    Student (Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
}
