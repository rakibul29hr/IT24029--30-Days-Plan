/*
    This program explains two pillars of OOP:  
    1. Abstraction
    2. Polymorphism
*/
// Abstract class

abstract class Shape {
    abstract void area();
    void message() {
        System.out.println("This is a shape class.");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        double result = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}



//Polymorphism-> Same method name behaves differently

class Calculator {

    // method with 2 integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // same method name with 3 integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // same method name with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Day15Example2 {

    public static void main(String[] args) {

        // Parent reference, child object
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 4);

        s1.message();
        s1.area();

        System.out.println();

        s2.message();
        s2.area();

       System.out.println("\nPolymorphism Example:");

        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: "
                + calc.add(10, 20));

        System.out.println("Addition of 3 integers: "
                + calc.add(10, 20, 30));

        System.out.println("Addition of 2 doubles: "
                + calc.add(5.5, 4.5));
    }
}
