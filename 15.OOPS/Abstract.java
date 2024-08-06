// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    abstract void draw();
}

// Concrete subclass
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Creating an object of Circle and calling the draw method
        Shape shape = new Circle();
        shape.draw();
    }
}
