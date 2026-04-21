package Stack;

import java.util.*;

public class ArrayListStack {
    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            } else {
                int top = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return top;
            }
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

        public static void display(){
            for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayListStack.Stack.push(1);
        ArrayListStack.Stack.push(2);
        ArrayListStack.Stack.push(3);

        System.out.println("Stack contents:");
        ArrayListStack.Stack.display(); 

        System.out.println("Top element: " + ArrayListStack.Stack.peek()); 

        System.out.println("Popped: " + ArrayListStack.Stack.pop()); 
        System.out.println("Popped: " + ArrayListStack.Stack.pop()); 

        System.out.println("Stack contents after pop:");
        ArrayListStack.Stack.display(); 

        System.out.println("Is stack empty? " + ArrayListStack.Stack.isEmpty());
    }
    
}
