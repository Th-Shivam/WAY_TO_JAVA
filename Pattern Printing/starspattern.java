import java.util.*;

public class starspattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n (i.e., row number) : ");
        int n = sc.nextInt();
        String star = "*";
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(star);
            }
            
            for(int j = 2 ; j<=i ; j++){
                System.out.print(star);
            }

            System.out.println();
        }
         for (int i = n; i >= 1; i--) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(star);
            }
            
            for(int j = 2 ; j<=i ; j++){
                System.out.print(star);
            }

            System.out.println();
        }
        sc.close();
    }
}