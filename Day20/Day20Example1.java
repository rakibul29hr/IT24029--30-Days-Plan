

class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Type Promotion Example
    void show(int num) {
        System.out.println("Integer method called: " + num);
    }

    void show(double num) {
        System.out.println("Double method called: " + num);
    }
}

// Parent Class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Day20Example1 {

    public static void main(String[] args) {

        System.out.println("=== METHOD OVERLOADING ===");

        Calculator calc = new Calculator();

        System.out.println("Add int: " + calc.add(10, 20));
        System.out.println("Add double: " + calc.add(5.5, 4.5));
        System.out.println("Add three ints: " + calc.add(1, 2, 3));

        System.out.println("\n=== TYPE PROMOTION ===");

        calc.show(100);     // int method
        calc.show(12.5f);   // float promoted to double

        System.out.println("\n=== METHOD OVERRIDING ===");

        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();
    }
}
