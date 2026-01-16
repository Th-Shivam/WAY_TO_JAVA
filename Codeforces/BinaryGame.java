import java.util.*;

public class BinaryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of test cases

        while (n-- > 0) {
            int t = sc.nextInt();   // size of array
            int one = 0;

            int[] a = new int[t];

            for (int i = 0; i < t; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    one++;
                }
            }

            if (one == t) {
                System.out.println("Alice");
            } else if (a[0] == 1) {
                System.out.println("Alice");
            } else if (a[t - 1] == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }

        sc.close();
    }
}
