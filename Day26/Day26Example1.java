

class Static {

    // Static field
    static int count = 0;

    // Static block
    static {
        System.out.println("Static block executed.");
    }

    // Constructor
    Static() {
        count++;
    }

    // Static method
    static void showCount() {
        System.out.println("Object Count: " + count);
    }
}


// Utility class example
class MathUtility {

    // Private constructor prevents object creation
    private MathUtility() {
    }

    static int square(int x) {
        return x * x;
    }

    static int cube(int x) {
        return x * x * x;
    }
}


// Singleton utility design
class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    static Singleton getInstance() {
        return instance;
    }

    void showMessage() {
        System.out.println("Singleton Object Accessed");
    }
}



public class Day26Example1 {

    public static void main(String[] args) {



        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        StaticDemo.showCount();

        System.out.println("\n Utility Class");

        System.out.println("Square of 5: " + MathUtility.square(5));
        System.out.println("Cube of 3: " + MathUtility.cube(3));

        System.out.println("\n=== Singleton Design ===");

        Singleton obj = Singleton.getInstance();
        obj.showMessage();
    }
}
