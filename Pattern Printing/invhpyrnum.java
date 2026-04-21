import java.util.* ;
public class invhpyrnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed :");
        int n = sc.nextInt();

        System.out.println("The required pattern is :");

        for (int i = n ; i>=1 ; i--){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
