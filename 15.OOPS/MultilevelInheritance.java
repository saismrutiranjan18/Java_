public class MultilevelInheritance {
        public static void main(String[] args) {
            Dog dobby = new Dog();
            dobby.eat();
            dobby.legs = 4;
            System.out.println(dobby.legs);
        }
    }
    
    //Base Class
    class Animal{
        String color;
        void eat(){
            System.out.println("eats");
        }
    
        void breathe(){
            System.out.println("breathes");
        }
    }
    
    //Derived Class
    class Mammals extends Animal{
        int legs;
    }

    class Dog extends Mammals{
        String breed;
}


