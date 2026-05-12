
// Parent Class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof");
    }
}

// Child Class 2
class Cat extends Animal {

    void meow() {
        System.out.println("Cat says: Meow");
    }

    @Override
    void sound() {
        System.out.println("Cat makes soft sound");
    }
}

public class Day21Example1 {

    public static void main(String[] args) {

        System.out.println("=== UPCASTING ===");

        // Upcasting (Implicit Casting)
        Animal a1 = new Dog();

        // Polymorphic Reference
        a1.sound();

        System.out.println("\n=== DOWNCASTING ===");

        // Explicit Downcasting
        Dog d1 = (Dog) a1;
        d1.bark();

        System.out.println("\n=== SAFE CASTING USING instanceof ===");

        Animal a2 = new Cat();

        if (a2 instanceof Cat) {
            Cat c1 = (Cat) a2;
            c1.meow();
        } else {
            System.out.println("Casting not safe");
        }

        System.out.println("\n=== RUNTIME TYPE IDENTIFICATION ===");

        System.out.println("Class of a1: " + a1.getClass().getName());
        System.out.println("Class of a2: " + a2.getClass().getName());

        System.out.println("\n=== COMMON MISTAKE: UNSAFE CASTING ===");

        try {

            // Wrong Casting
            Dog wrongDog = (Dog) a2;

            wrongDog.bark();

        } catch (ClassCastException e) {

            System.out.println("Exception Caught: Unsafe Casting!");
        }
    }
}
