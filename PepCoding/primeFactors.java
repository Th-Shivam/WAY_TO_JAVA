import java.util.* ;

class primeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number :");
        int n = sc.nextInt(); //input number
        System.out.print("Prime factors are : ");
        int divisor = 2 ;
        while(n>1){
            if(n%divisor == 0){
                System.out.print(divisor + " ") ;
                n = n / divisor ;
            } else {
                divisor++ ;
            }
        }
    }
}