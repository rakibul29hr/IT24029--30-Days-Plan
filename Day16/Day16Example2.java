
class Base {

    String name;

    // Constructor 1
    Base() {
        this("");

        System.out.println("No-argument constructor of base class");
    }

    // Constructor 2
    Base(String name) {
        this.name = name;

        System.out.println("Calling parameterized constructor of base");
    }
}
\
class Derived extends Base {

    // Constructor 3
    Derived() {

        System.out.println("No-argument constructor of derived");
    }

    // Constructor 4
    Derived(String name) {

        // Calls parameterized constructor of Base class
        super(name);

        System.out.println("Calling parameterized constructor of derived");
    }
}

// Main class
public class Day16Example2 {
    public static void main(String[] args) {
        Derived obj = new Derived("test");

     
    }
}
