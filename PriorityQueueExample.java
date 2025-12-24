import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(40);
        queue.add(10);
        queue.add(30);

        System.out.println(queue);
        System.out.println(queue.poll());
    }
}
