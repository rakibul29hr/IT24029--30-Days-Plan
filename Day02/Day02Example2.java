package COurse;

// creating a Class
     class Calculator{
        public int add(int a, int b){
            return a+b;
        }
        public int subtract(int a, int b){
            return a-b;
        }

}

public class Day2Example2 {
         public static void main(String [] args){

             Calculator calculate1= new Calculator(); // creating an object

             int sumOfTwoNUmber=calculate1.add(34,45);
             System.out.println("Sum of 34 and 45 is" + sumOfTwoNUmber);
         }

}
