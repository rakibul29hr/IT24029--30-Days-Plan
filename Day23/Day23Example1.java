
// 1. Interface Basics
interface Animal {
    // public static final by default
    String TYPE = "Living Being";

    // abstract method
    void sound();
}

// 2. Multiple Inheritance with Interfaces
interface Walker {
    void walk();
}

interface Swimmer {
    void swim();
}

// Class implementing multiple interfaces
class Duck implements Animal, Walker, Swimmer {

    @Override
    public void sound() {
        System.out.println("Duck says: Quack Quack");
    }

    @Override
    public void walk() {
        System.out.println("Duck can walk");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}

// 3. Interface vs Abstract Class

// Abstract class
abstract class Vehicle {

    // concrete method
    void start() {
        System.out.println("Vehicle is starting...");
    }

    // abstract method
    abstract void fuelType();
}

// Interface
interface Electric {

    void battery();
}

// Class extending abstract class and implementing interface
class Tesla extends Vehicle implements Electric {

    @Override
    void fuelType() {
        System.out.println("Fuel Type: Electric Power");
    }

    @Override
    public void battery() {
        System.out.println("Tesla uses lithium battery");
    }
}

// Main class
public class Day23Example1 {

    public static void main(String[] args) {

        System.out.println("=== Interface Basics ===");
        Duck d = new Duck();

        d.sound();
        System.out.println("Type: " + Animal.TYPE);

        System.out.println("\n=== Multiple Inheritance ===");
        d.walk();
        d.swim();

        System.out.println("\n=== Interface vs Abstract Class ===");
        Tesla t = new Tesla();

        t.start();
        t.fuelType();
        t.battery();
    }
}
