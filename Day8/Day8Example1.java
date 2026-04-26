import java.util.LinkedList;
import java.util.Queue;

public class Day8Example1 {
    public static  void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        System.out.println("Queue : " + queue);

        // Dequeue operation
        String removedItem = queue.poll();
        System.out.println("Removed Item: "+ removedItem);;

        //Displaying the Queue after Dequeue
        System.out.println("Queue after dequeue: "+queue);
    }
}
