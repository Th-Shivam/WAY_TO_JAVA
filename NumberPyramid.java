import java.util.* ;
public class NumberPyramid{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();
        
        for(int i = 1 ; i<=n ; i++ ){
            int spaces = n-i;
            
            for(int j =1 ; j<=spaces ; j++ ){
                System.out.print(" ");
            }
            
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i);
                System.out.print(" ");
            }
            
            System.out.println();
        }
        
        
    sc.close(); }
    }