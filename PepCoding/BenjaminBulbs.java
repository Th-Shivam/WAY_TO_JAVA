import java.util.Scanner;

public class BenjaminBulbs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i * i <= n; i++) {
            System.out.print((i * i));
            if ( (i+1)*(i+1) <= n ) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
