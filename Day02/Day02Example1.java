package COurse;

    class Employee{
        public String name; //Here name has public access modifier
        private  double salary; // salary has private access modifier
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        // Public method to access private data safely
        public void showSalary() {
            System.out.println(name + "'s salary is: " + salary);
        }
    }
public class Day2Example1 {
    public static void main(String [] args)
    {
        Employee emp = new Employee("Karim",60000);
        emp.showSalary();
    }

}
