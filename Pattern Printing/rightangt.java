import java.util.*;

public class rightangt {

            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                String star = "*";
                System.out.println("Enter the number of rows to be printed :");
                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(star);
                    }
                    System.out.println();
                }
                sc.close();

            }
}
