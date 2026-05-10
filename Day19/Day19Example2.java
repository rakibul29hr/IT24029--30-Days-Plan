

// Data Security Design Example

class Student {

    // private field
    private int age;

    // setter with validation
    public void setAge(int age) {

        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // getter method
    public int getAge() {
        return age;
    }
}

public class Day19Example2 {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setAge(20);

        System.out.println("Age: " + s1.getAge());

        s1.setAge(-5);
    }
}
