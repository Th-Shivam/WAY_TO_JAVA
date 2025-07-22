import java.util.*;
class MaigreaterOf2n {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the two numbers for comparison :");
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       if(a>b){
           System.out.println("The greater number is : " + a );
       } else{
           System.out.println("The greater number is : " + b ) ;
       }
       sc.close();
    }
}