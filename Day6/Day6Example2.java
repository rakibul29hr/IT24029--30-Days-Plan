import java.util.HashMap;
import java.util.HashSet;

public class Day6Example2 {
    public static void main(String[] args){
        HashSet <String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        System.out.println("Colors : "+ colors);

        //hash map
        HashMap<String, Integer> ageMap= new HashMap<>();

        ageMap.put("Rakibul",21);

        ageMap.put("Halima",22);

        ageMap.put("Robiul ",44);

        System.out.println("Age map: "+ ageMap);
        int RakibulAge= ageMap.get("Rakibul");
        System.out.println("Rakibul is " + RakibulAge+" years old");
    }

}
