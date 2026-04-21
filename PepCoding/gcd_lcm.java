import java.util.* ;
public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter two numbers:") ;
        int num1 = sc.nextInt() ;
        int num2 = sc.nextInt() ;
        int divisor = num1 ;
        int dividend = num2 ;
        while(dividend % divisor != 0 ){
            int rem = dividend % divisor ;
            dividend = divisor ;
            divisor = rem ; 
    }
    System.out.println("GCD is: " + divisor) ;
    int lcm = (num1 * num2) / divisor ;
    System.out.println("LCM is: " + lcm) ;
    sc.close();
}
}