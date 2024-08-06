
    class Animal {
        // Method in the superclass
        void makeSound() {
            System.out.println("The animal makes a sound");
        }
    }
    
    class Dog extends Animal {
        // Overriding the method in the subclass
        @Override
        void makeSound() {
            System.out.println("The dog barks");
        }
    }
    
    class Cat extends Animal {
        // Overriding the method in the subclass
        @Override
        void makeSound() {
            System.out.println("The cat meows");
        }
    }
    
    public class MethodOverriding {
        public static void main(String[] args) {
            Animal myAnimal = new Animal(); // Create an Animal object
            Animal myDog = new Dog();       // Create a Dog object
            Animal myCat = new Cat();       // Create a Cat object
    
            myAnimal.makeSound();  // Calls the method in Animal class
            myDog.makeSound();     // Calls the overridden method in Dog class
            myCat.makeSound();     // Calls the overridden method in Cat class
        }
    }

