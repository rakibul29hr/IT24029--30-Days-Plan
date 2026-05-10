

class Temp {

    // Default constructor
    Temp() {
        // Calling constructor with one parameter
        this(5);

        System.out.println("The Default Constructor");
    }

    // Constructor with one parameter
    Temp(int x) {
        // Calling constructor with two parameters
        this(5, 15);

        System.out.println("Value of x: " + x);
    }

    // Constructor with two parameters
    Temp(int x, int y) {
        System.out.println("Product of x and y: " + (x * y));
    }
}

// Main class
public class Day16Example1 {

    public static void main(String[] args) {

        // Creating object of Temp class
        new Temp();
    }
}
