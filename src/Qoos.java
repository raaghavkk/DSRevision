import java.util.LinkedList;
import java.util.Queue;

public class Qoos {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //add elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        //print out the queue
        System.out.println("Queue: " + queue);

        //remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed from the front: " + front);

        // print the updated queue
        System.out.println("Updated Queue after removal: " + queue);

        // add another element to the queue
        queue.add("Date");

        //peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        //print the updated queue
        System.out.println("Updated Queue after peek: " + queue);
    }
}
