

class Bird {

    void move() {
        System.out.println("Bird is moving");
    }
}

class Sparrow extends Bird {

    @Override
    void move() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {

    @Override
    void move() {
        System.out.println("Penguin is swimming");
    }
}




interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class BasicPrinter implements Printer {

    public void print() {
        System.out.println("Printing document...");
    }
}

class MultiFunctionPrinter implements Printer, Scanner {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}


interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {

    public void type() {
        System.out.println("Typing with Wired Keyboard");
    }
}

class WirelessKeyboard implements Keyboard {

    public void type() {
        System.out.println("Typing with Wireless Keyboard");
    }
}

class Computer {

    private Keyboard keyboard;
    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void start() {
        keyboard.type();
        System.out.println("Computer Started");
    }
}


public class Day27Example2 {

    public static void main(String[] args) {

        System.out.println("=== Liskov Substitution Principle ===");

        Bird bird1 = new Sparrow();
        Bird bird2 = new Penguin();

        bird1.move();
        bird2.move();


        System.out.println("\n=== Interface Segregation Principle ===");

        BasicPrinter bp = new BasicPrinter();
        bp.print();

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();


        System.out.println("\n=== Dependency Inversion Principle ===");

        Keyboard wired = new WiredKeyboard();
        Computer computer1 = new Computer(wired);
        computer1.start();

        System.out.println();

        Keyboard wireless = new WirelessKeyboard();
        Computer computer2 = new Computer(wireless);
        computer2.start();
    }
}
