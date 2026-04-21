import java.util.*;
public class throwError {
    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a positive number : ");
            int i = sc.nextInt();
            sc.close();

            if (i < 0){
                throw new Exception("You entered a negative number .");
            }
            
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
       
    }
    
}
