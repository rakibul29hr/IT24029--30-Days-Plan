class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // equals() method
    public boolean equals(Object obj) {

        Student s = (Student) obj;

        return this.id == s.id &&
               this.name.equals(s.name);
    }

    // hashCode() method
    public int hashCode() {
        return id + name.hashCode();
    }

    public String toString() {
        return id + " " + name;
    }
}

import java.util.HashSet;

public class Day25Example1 {

    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student(101, "Rahim");
        Student s2 = new Student(101, "Rahim");

        students.add(s1);
        students.add(s2);

        System.out.println("HashSet Data:");

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nSize of HashSet: " + students.size());
    }
}
