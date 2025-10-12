import java.util.Scanner;

public class CodeF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        if (!isPrime(m)) {
            System.out.println("NO");
            return;
        }
        
        boolean hasPrimeInBetween = false;
        for (int i = n + 1; i < m; i++) {
            if (isPrime(i)) {
                hasPrimeInBetween = true;
                break;
            }
        }
        
        if (hasPrimeInBetween) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
    
    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}