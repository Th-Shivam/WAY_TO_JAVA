package Stack ;// Stack implementation using Array
class Stack {
    private int[] arr;   // Array to store stack elements
    private int top;     // Index of top element
    private int capacity; // Maximum capacity of stack

    // Constructor
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push element onto the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + x);
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed " + x);
    }

    // Pop element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop");
            return -1;
        }
        return arr[top--];
    }

    // Peek at the top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Get current size of stack
    public int size() {
        return top + 1;
    }
}

// Main class to test the Stack
public class ArrayStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element now: " + stack.peek());

        stack.push(40);
        stack.push(50);
        stack.push(60);  // This will give overflow
    }
}