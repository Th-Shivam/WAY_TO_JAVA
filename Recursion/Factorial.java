public class Factorial {
    public static int factorial (int n){

        if(n == 0 || n == 1){
            return 1;
        }

        int factorialm1 = factorial(n-1);
        int fact = n * factorialm1 ;

        return fact;
    }

    public static void main(String[] args) {
        int n = 5; 
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}