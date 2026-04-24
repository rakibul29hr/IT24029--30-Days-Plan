 class Animal {
    String name;
    void eat(){
        System.out.println(name + " is eating.");;
    }
}
//Here Animal is superclass and it has property name and a method eat();
class Dog extends Animal{
    void bark(){
        System.out.println(name + "Says woof!");
    }
}
// here Dog is a subclass that interite Animal property and add another method called bark

 class Puppy extends Dog{
     void weep(){
         System.out.println(name+" is weeping" );
     }
 }
 // here Puppy extend a subclass so it is multilevel inheritance

 class Cat extends Animal{
    void meow(){
        System.out.println(name + " says meow!");
    }
 }

 public class Day4Example1{
    public static void main(String[] args){
        Dog myDog= new Dog();
        myDog.name="Buddy";
       myDog.eat(); //Inherited method from animal
        myDog.bark(); //Method from dog class

    }
 }
