import java.util.*;

public class NameFunction {

    public static void printMyName(String name) {
        System.out.println("My name is " + name);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        printMyName(name);
        sc.close(); 

    }
}