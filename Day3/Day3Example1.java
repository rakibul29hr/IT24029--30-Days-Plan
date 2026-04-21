package COurse;
    class Person{

//        private attributes
        private String name;
        private int age;

        //Constructor
        public Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        //public method getname
        public String getName(){
            return name;
        }
        //public method to set the name
        public void setName(String name){
            this.name=name;
        }
        //public method to get the age
        public int getAge(){
            return age;
        }

        //public method to set the age

        public void setAge(int age){
            if(age>=0){
                this.age=age;
            }else{
                System.out.println("Age cannot be negative");
            }

        }


    }
public class Day3Example1 {

        public static void main(String[] args){

             //creating a new person object
            Person person1=new Person("Alice",30);

            //accessing the name using getter
            System.out.println("Name "+ person1.getName());

            //accessing the age using getter
            System.out.println("Name "+ person1.getAge());

            //Modify the properties using setter
         person1.setName("bob");

//         Displaying modifies name

            System.out.println("Modified name "+ person1.getName());
        }
}
