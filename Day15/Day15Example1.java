/*
    This program explains two pillars of OOP:
    1. Encapsulation
    2. Inheritance
*/

// Private data + Public methods = Encapsulation

class Person {
    // private variables 
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setter 
    public void setName(String name) {
        this.name = name;
    }

    // getter 
    public String getName() {
        return name;
    }

    // setter 
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // getter 
    public int getAge() {
        return age;
    }

    // display 
    public void displayPersonInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Student class inherits Person class

class Student extends Person {

    private String department;

    // constructor
    public Student(String name, int age, String department) {
        super(name, age); // calling parent constructor
        this.department = department;
    }

    // method for displaying student info
    public void displayStudentInfo() {
        displayPersonInfo(); // inherited method
        System.out.println("Department : " + department);
    }
}


// Main Class
public class Day15Example1 {

    public static void main(String[] args) {

        // Creating Student object
        Student s1 = new Student("Rakib", 21, "ICT");

        // Accessing methods
        s1.displayStudentInfo();

        System.out.println("\nUsing Getter:");
        System.out.println("Student Name: " + s1.getName());

        // Updating value using setter
        s1.setAge(22);

        System.out.println("\nAfter Updating Age:");
        s1.displayStudentInfo();
    }
}
