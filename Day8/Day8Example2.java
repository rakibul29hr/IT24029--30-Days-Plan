import java.util.HashMap;

public class Day8Example2 {
    public static void main(String[] args)
    {
        //creatng a Hashmap
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Cherry",3);
//        Acessing values;

        System.out.println("Value for key 'Apple' : " + map.get(("Apple")));

        for (String key : map.keySet())
        {
            System.out.println(key + ": " + map.get(key));
        }

        if(map.containsKey("Banana")){
            System.out.println("banana Exitsts in the map");
        }
        map.remove("Cherry");
    }

}
