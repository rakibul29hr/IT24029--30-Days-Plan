import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day6Example1 {
    public static void main(String[] args){

        //Creating a List
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits "+ fruits);
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit " + firstFruit);

        LinkedList <String> animals= new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        System.out.println("Animals: " + animals);

    }
}
