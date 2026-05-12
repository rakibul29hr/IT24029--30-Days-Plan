

// Parent Class
class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

// Child Class
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

// Another Child Class
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self button");
    }
}

// Covariant Return Type Example
class Fruit {

    Fruit getObject() {
        System.out.println("Fruit object returned");
        return this;
    }
}

class Mango extends Fruit {

    // Covariant Return Type
    @Override
    Mango getObject() {
        System.out.println("Mango object returned");
        return this;
    }
}

// Decoupled Design Example
class Notification {

    void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending SMS Notification");
    }
}

public class Day20Example2 {

    public static void main(String[] args) {

        System.out.println("=== DYNAMIC METHOD DISPATCH ===");

        // Parent reference, child object
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        // Runtime Binding
        v1.start();
        v2.start();

        System.out.println("\n=== COVARIANT RETURN TYPE ===");

        Mango mango = new Mango();
        mango.getObject();

        System.out.println("\n=== POLYMORPHIC BEHAVIOR ===");

        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();

        n1.send();
        n2.send();

        System.out.println("\n=== FLEXIBLE OBJECT DESIGN ===");

        Notification[] notifications = {
            new EmailNotification(),
            new SMSNotification()
        };

        for (Notification n : notifications) {
            n.send();
        }
    }
}
