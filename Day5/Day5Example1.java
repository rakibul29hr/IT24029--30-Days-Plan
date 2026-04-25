//defining an interface
interface Animal{
    void sound() ; //method signature
}
//implementing the interface in a class
class Dog implements Animal{
    public void sound(){
        System.out.println("Bark");
    }

}
class Cat implements Animal{
    public void sound(){
        System.out.println("Meow");
    }

}
//Defining an abstract class

abstract  class Shape {
    abstract void draw(); //Abstract method
    void display(){
        System.out.println("This is a shape");
    }

}
//Concrete subclass
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
public class Day5Example1 {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();
        Shape shape= new Circle();
        shape.draw();
        shape.display();
    }

}
