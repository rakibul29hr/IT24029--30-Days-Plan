class Person implements Cloneable {

    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString()
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    // equals()
    public boolean equals(Object obj) {

        Person p = (Person) obj;

        return this.id == p.id &&
               this.name.equals(p.name);
    }

    // hashCode()
    public int hashCode() {
        return id + name.hashCode();
    }

    // clone()
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class Day24Example1 {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Person p1 = new Person(101, "Rahim");

        // toString()
        System.out.println("toString():");
        System.out.println(p1);

        // clone()
        Person p2 = (Person) p1.clone();

        System.out.println("\nCloned Object:");
        System.out.println(p2);

        // equals()
        System.out.println("\nEquals:");
        System.out.println(p1.equals(p2));

        // hashCode()
        System.out.println("\nHash Codes:");
        System.out.println("p1: " + p1.hashCode());
        System.out.println("p2: " + p2.hashCode());
    }
}
