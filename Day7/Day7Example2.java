import java.util.HashSet;
import java.util.TreeSet;

public class Day7Example2 {
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana"); //Duplicate not added;

        System.out.println("Fruits Set: "+fruits);
        fruits.remove("Cherry");
        System.out.println("After removal Cherry Fruits list: "+fruits);

        //TreeSet
        TreeSet <Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5); // duplicate will not be added

        System.out.println("Number List Tree set: "+ numbers);

        //checking if an element exits
        if(numbers.contains(5))
        {
            System.out.println("5 is present in the set");
        }

        numbers.remove(4);
        System.out.println("After removing 4 "+ numbers);
    }
}
