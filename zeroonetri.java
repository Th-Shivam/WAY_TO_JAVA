import java.util.*;

public class zeroonetri {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed :");
        int n = sc.nextInt();
        int number = 1;

        System.out.println("The required pattern is => ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                if (number == 1) 
                {
                    number = 0; } else{
                    number = 1;
                    }
            }
            System.out.println();
        }
        sc.close();

    }
}
