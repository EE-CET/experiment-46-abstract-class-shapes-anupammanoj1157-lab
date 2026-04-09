// Abstract class cannot be instantiated directly
abstract class Shape {
    // Abstract method: defined here, implemented in subclasses
    abstract void numberOfSides();
}

// Subclass providing specific implementation for Rectangle
class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }
}
class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class AbstractShapes {
    public static void main(String[] args) {
   
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Hexagon hex = new Hexagon();
        rect.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();
    }
}
