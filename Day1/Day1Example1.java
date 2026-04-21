package COurse;

class Dog {
    // Properties (Private for Encapsulation)
    private String breed;
    private int age;
    public String color; // Publicly accessible

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Methods
    public void bark() {
        System.out.println("Woof! Woof!");
    }
//methods
    public void eat() {
        System.out.println("The dog is eating.");
    }
}

// Inheritance: ServiceDog inherits from Dog
class ServiceDog extends Dog {
    public ServiceDog(String breed, int age, String color) {
        super(breed, age, color); // Calls the Parent constructor
    }

    // New Method specific to ServiceDog
    public void guide() {
        System.out.println("Guiding the owner safely...");
    }
}

public class Day1Example1 {
    public static void main(String[] args) {
        // Creating an Object
        Dog buddy = new Dog("Golden Retriever", 3, "Gold");

        buddy.bark(); // Accessing method

        ServiceDog max = new ServiceDog("Labrador", 5, "Black");
        max.guide();  // Accessing specialized method
    }
}
