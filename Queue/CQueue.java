package Queue;

class Queue{
    int arr[] ;
    int size ;
    int front = -1 ;
    int rear = -1 ;

    Queue(int n){
        arr =  new int[n] ;
        this.size = n ;
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1 ;
    }

    public boolean isFull(){
        return (rear+1)%size == front ;
    }



    // Enqueue 

    public void add(int data){
        if(isFull()){
            System.out.println("Queue is full , can't add more elem .");
            return ;
        }
        if(front == - 1){
            front = 0 ;
        }
        rear = (rear+1)%size ;
        arr[rear] = data ;
    }

    // Dequeue

    public int remove(){
        if(isEmpty()){
            System.out.println("The queue is already empty .");
            return -1 ;
        }

        if(front == rear){
            int result = arr[front] ;
            front = rear = -1;
            return result ;
        }

        int result = arr[front] ;
        front = (front+1)%size ;
        return result ;
    }

    // Peek 

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty .");
            return -1 ;
        }
        return arr[front] ;
    }
}

public class CQueue {
    public static void main(String[] args) {
        Queue Q  = new Queue(5) ;
        Q.add(5);
        Q.add(4);
        Q.add(3);
        while(!Q.isEmpty()){
            System.out.println(Q.remove());
        }
    }
}
