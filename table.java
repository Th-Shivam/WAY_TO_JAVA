import java.util.* ;
public class table {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to print the table for :");
    int n = sc.nextInt();

    System.out.println("The required table is :");
    
    for (int i = 1 ; i <=11 ; i++){

        System.out.println(n*i);
    }
    sc.close();
} 
    
    
}
