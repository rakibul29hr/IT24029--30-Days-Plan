// File name: Day18Example1.java

final class Student {

    // final fields
    private final String name;
    private final int age;

    // constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Day18Example1 {

    public static void main(String[] args) {

        Student s1 = new Student("Rahim", 20);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
