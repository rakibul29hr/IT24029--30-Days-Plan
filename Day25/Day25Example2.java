class Address {

    String city;

    Address(String city) {
        this.city = city;
    }
}

class Employee implements Cloneable {

    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Shallow Cloning
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep Cloning
    public Employee deepClone() {

        Address newAddress = new Address(address.city);

        return new Employee(id, name, newAddress);
    }

    void display() {
        System.out.println(id + " " + name + " " + address.city);
    }
}
public class Day25Example2 {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Address a1 = new Address("Dhaka");

        Employee e1 = new Employee(1, "Karim", a1);

        // Shallow Clone
        Employee shallow = (Employee) e1.clone();

        // Deep Clone
        Employee deep = e1.deepClone();

        // Change original object's address
        e1.address.city = "Tangail";

        System.out.println("Original Object:");
        e1.display();

        System.out.println("\nShallow Clone:");
        shallow.display();

        System.out.println("\nDeep Clone:");
        deep.display();
    }
}
