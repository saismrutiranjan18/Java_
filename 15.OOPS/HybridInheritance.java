
    // Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Another base class
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

// Interface
interface Pet {
    void play();
}

// Derived class using hybrid inheritance (class and interface)
class Dog extends Mammal implements Pet {
    @Override
    public void play() {
        System.out.println("The dog plays fetch.");
    }
    
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        myDog.eat();   // From Animal class
        myDog.walk();  // From Mammal class
        myDog.play();  // From Pet interface
        myDog.bark();  // From Dog class
    }
}
