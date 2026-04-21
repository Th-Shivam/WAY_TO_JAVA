package Queue;

class Qarray {
    int arr[];
    int size;
    int rear = -1;

    Qarray(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Queue size must be positive");
        }
        arr = new int[n];
        this.size = n;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    // enqueue
    public void add(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    // dequeue
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

}

public class q1 {
public static void main(String[] args) {
    Qarray q = new Qarray(5);
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q.peek()); // 1
    System.out.println(q.remove()); // 1
    System.out.println(q.peek()); // 2
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7); // Queue is full
    while (!q.isEmpty()) {
        System.out.println(q.remove());
    }
    System.out.println(q.remove()); // Queue is empty
}
}
