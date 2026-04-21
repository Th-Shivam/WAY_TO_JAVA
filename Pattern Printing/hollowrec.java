import java.util.* ;
public class hollowrec {
    public static void main(String args[]){
        String star = "*";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed :");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns to be printed :");
        int m = sc.nextInt();

        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=m  ; j++){
                if(i ==1 || i ==n || j==1 || j==m){
                    System.out.print(star);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();

    }
}
