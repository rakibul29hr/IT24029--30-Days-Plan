

abstract class Vehicle {

    // Concrete field
    String brand;

    // Abstract constructor concept
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Concrete method (shared functionality)
    void showBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }

    // Abstract method (must be implemented by child classes)
    abstract void startEngine();
}

// Concrete subclass
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println("Car engine starts with key ignition.");
    }
}

// Another subclass
class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println("Bike engine starts with self-start button.");
    }
}

public class Day22Example1 {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota");
        car.showBrand();
        car.startEngine();

        System.out.println();

        Vehicle bike = new Bike("Yamaha");
        bike.showBrand();
        bike.startEngine();
    }
}
