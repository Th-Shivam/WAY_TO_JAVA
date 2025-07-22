import java.util.* ;
public class invhalfpyr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String star = "*";
        System.out.println("Enter the number of rows to be printed :");
        int n = sc.nextInt();

        for (int i = 1 ; i<=n ; i++){
            for(int j = 0 ; j<n-i ; j++ ){
                System.out.print(" ");
            }
            for(int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
