

class School {

    // final field
    private final String[] subjects;

    // constructor with defensive copying
    School(String[] subjects) {
        this.subjects = subjects.clone();
    }

    // defensive copying in getter
    public String[] getSubjects() {
        return subjects.clone();
    }
}

public class Day18Example2 {

    public static void main(String[] args) {

        String[] arr = {"Math", "English"};

        School s1 = new School(arr);

        // get copy of array
        String[] copy = s1.getSubjects();

        // changing copied array
        copy[0] = "Science";

        // original data remains unchanged
        System.out.println(s1.getSubjects()[0]);
    }
}
