package MultiThreading;

public class ThreadOperations {
    public static void main(String[] args) {

        System.out.println("Program started ");
        int x = 70149 + 30330 ;
        System.out.println("Sum is " + x);
        Thread t = Thread.currentThread() ;
        String tname = t.getName() ;
        System.out.println("The current thread is :" + tname );
        System.out.println("Program executed succesfully .");

    }
}
