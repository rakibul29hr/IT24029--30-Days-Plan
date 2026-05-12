
interface Calculator {

    // abstract method
    int add(int a, int b);

    // default method
    default void showMessage() {
        System.out.println("Calculator Interface Default Method");
        log();
    }

    // static method
    static void info() {
        System.out.println("Static Method inside Interface");
    }

    // private method
    private void log() {
        System.out.println("Private method used internally");
    }
}

// Implementation class
class SimpleCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

// 5. Functional Interfaces

@FunctionalInterface
interface Greeting {

    // single abstract method
    void sayHello(String name);
}

public class Day23Example2 {

    public static void main(String[] args) {

        System.out.println("=== Modern Interface Features ===");

        SimpleCalculator sc = new SimpleCalculator();

        int result = sc.add(10, 20);

        System.out.println("Addition Result: " + result);

        sc.showMessage();

        Calculator.info();

        System.out.println("\n=== Functional Interface ===");

        // Lambda expression
        Greeting g = (name) -> {
            System.out.println("Hello, " + name);
        };

        g.sayHello("Sakib");
    }
}
