import java.util.*;

public class butterfly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        String star = "*";
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }

        for (int i = n; i <= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }

    }
}
