class Employee {

    private String name;
    private int age;
    private double salary;


    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
    
        Employee emp = new Employee("Sai Das", 18, 50000);
        
        emp.setAge(35);
        emp.setSalary(60000);

        emp.displayDetails();
    }
}

