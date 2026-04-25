import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Day7Example1 {
    public static void main(String[] args){

        //Creating a List
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits "+ fruits);
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit " + firstFruit);
        //Remove an element
        fruits.remove("Banana");
        System.out.println("Fruits List: "+fruits);

        LinkedList <String> colors= new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        System.out.println("Colors : "+ colors);
        System.out.println("First color is  : "+ colors.get(0));
        //Remove an element in lined list
        colors.remove("Green");;
        System.out.println("Colors After remove Green : "+ colors);

    }
}
