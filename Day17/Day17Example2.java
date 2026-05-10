

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    // Deep copy method
    Book deepCopy() {
        return new Book(new String(this.title));
    }
}

public class Day17Example2 {

    public static void main(String[] args) {

        Book b1 = new Book("Java");

        // Deep copy
        Book b2 = b1.deepCopy();

        b2.title = "Python";

        System.out.println("Deep Copy Example:");
        System.out.println("b1 title: " + b1.title);
        System.out.println("b2 title: " + b2.title);
    }
}
