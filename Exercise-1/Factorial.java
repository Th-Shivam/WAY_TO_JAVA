import java.util.*;
public class Factorial {

    public static int Fact(int n ){
        int fact = 1 ;
        if(n==0){
            System.out.println("Factorial of 0 is 1");
            return 1;
            
        }
        if(n<0){
            System.out.println("Factorial of negative number is not defined");
            return -1;
            
        }

        for(int i=n ; i>=1 ; i--){
             fact *= i ; }

             return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial : ");
        int n = sc.nextInt();
        int result = Fact(n);
        if(result == -1) {
            System.out.println("Cannot compute factorial for negative numbers.");
            sc.close();
            return;
        } else {
            System.out.println("Factorial of " + n + " is: ");
        }
        sc.close();
    }
    
}
