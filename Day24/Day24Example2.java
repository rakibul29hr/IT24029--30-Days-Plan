class Book {

    int price;

    Book(int price) {
        this.price = price;
    }

    // Logical equality
    public boolean equals(Object obj) {

        Book b = (Book) obj;

        return this.price == b.price;
    }
}

public class Day24Example2 {

    public static void main(String[] args) {

        Book b1 = new Book(500);
        Book b2 = new Book(500);

        Book b3 = b1;

        // Reference Equality
        System.out.println("Reference Equality:");
        System.out.println(b1 == b2); // false
        System.out.println(b1 == b3); // true

        // Logical Equality
        System.out.println("\nLogical Equality:");
        System.out.println(b1.equals(b2)); // true
    }
}
