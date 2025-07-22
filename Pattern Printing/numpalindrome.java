import java.util.*;

public class numpalindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n (i.e., row number) : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            for(int j = 2 ; j<=i ; j++){
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}