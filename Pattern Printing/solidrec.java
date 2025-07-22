import java.util.* ;
public class solidrec {
    public static void main(String args[]){
        String star = "*";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed :");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns to be printed :");
        int m = sc.nextInt();

        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=m  ; j++){
                System.out.print(star);
            }
            System.out.println();
        }

        sc.close();

    }
}
