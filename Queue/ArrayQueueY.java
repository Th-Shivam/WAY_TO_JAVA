package Queue;
class ArrayQueue {
    int arr[];
    int size;
    int rear = -1;
    int front = -1;

    ArrayQueue(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Queue size must be positive");
        }
        arr = new int[n];
        this.size = n;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean add(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return false;
        }
        if (front == -1) front = 0;
        rear++;
        arr[rear] = data;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        front++;
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}

public class ArrayQueueY {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
        System.out.println(q.remove());
    }
}