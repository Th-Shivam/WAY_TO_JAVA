import java.util.*;

public class Pattern_8 {

    public static void printPattern(int n)
    {
        int i, j;

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }

                else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}