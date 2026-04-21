public class Fibonacci {
    public static void fib(int a , int b , int n ){
        if(n==0){
            return;
        }
        int c = a + b ;
        System.out.println(c);
        fib(b , c , n-1);
    }

    public static void main(String args[]){
        int a = 0 ;
        int b = 1 ;
        int n = 7 ;
        System.out.println(a);
        System.out.println(b);
        fib(a, b, n-2); // n-2 because we already printed the first two numbers

    }
}
