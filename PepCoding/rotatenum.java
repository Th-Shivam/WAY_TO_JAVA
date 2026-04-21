import java.util.* ;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the original number :") ;
        int n = sc.nextInt(); //input og num 
        String strNum = String.valueOf(n); // converting to string 
        int size = strNum.length() ; //calculated length 
        System.out.println("Enter the rotation number :") ;
        int k = sc.nextInt();
        if(k>size){
            k = k%size ;
        }
        if(k<0){
            k = k + size ;
        }
        int div = (int)Math.pow(10,k ) ;
        
        int rotatedNum = 0 ;
        int rem = n % div ;
        n /= div ;
        rotatedNum = rem * (int)Math.pow(10,size-k) + n ;
        System.out.println(rotatedNum) ;
        sc.close() ;
    }
}
