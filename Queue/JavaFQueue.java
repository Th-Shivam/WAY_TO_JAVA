package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class JavaFQueue {
    public static void main(String[] args) {
        // Can also use ArrayDeque which is faster than LinkedList .
        Queue<Integer> q = new LinkedList<>();

        // Enqueue elements
        q.add(10);
        q.add(20);
        q.add(30);

        // Dequeue and print elements
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}

