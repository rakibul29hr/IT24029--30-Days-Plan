package COurse;

class DogClass{
    String name;
    //no-arg constructor
    DogClass(){
        name="Unknown";
    }
    //parameterized constructor
    DogClass(String dogName){
        this.name=dogName;
    }
    void display(){
        System.out.println("Dogs name "+ name);
    }
}
public class Day3Example2 {
    public static  void main(String[] args){
        //create object with no-arg constructor
        DogClass dog1=new DogClass();
        dog1.display();

        //create object with perameterized constructor
        DogClass dog2 = new DogClass("Tom");

        dog2.display();

    }
}
