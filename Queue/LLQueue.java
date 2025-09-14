package Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLL {
    Node head;
    Node tail;

    QueueLL() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    // Enqueue
    public void add(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Dequeue 

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty .");
            return -1 ;
        }
        int result = head.data ;
        head = head.next ;
        return result ;
    }

    // Peek 

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty .");
            return -1 ;
        }
        return head.data ;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


}

public class LLQueue {

    
    public static void main(String[] args) {
        QueueLL q = new QueueLL() ;
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.display();
    }

}
