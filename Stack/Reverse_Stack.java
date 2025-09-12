package Stack;
import java.util.* ;
public class Reverse_Stack {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()){
            s.push(data) ;
            return ;
        }
        int top = s.pop() ;
        pushAtBottom(s, data);
        s.push(top) ;
    }

    public static void reverseStack(Stack<Integer> s){ 
        if(s.isEmpty()){
            System.out.println("Stack is empty") ;
            return ;
        }
        int top = s.pop() ;
        reverseStack(s);
        pushAtBottom(s,top) ;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>() ;
        stack.push(10) ;
        stack.push(20) ;
        stack.push(30) ;
        System.out.println(stack) ;
        reverseStack(stack);
        System.out.println(stack) ;
    }
}
