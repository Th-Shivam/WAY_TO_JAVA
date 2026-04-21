import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Select the operation to be performed :");
        char op = sc.next().charAt(0);  
        
        switch(op){
        case '+':  
            System.out.print(a+b);
            break;
        case '-':
            System.out.print(a-b);
            break;
        case '*':
            System.out.print(a*b);
            break; 
        case '/':
            System.out.print(a/b);  
            break;
        }

        sc.close();
    }
}