// Problem Statement

// King Luther has an army with N soldiers, each with an ID between 1 and N. The king wants to know how many soldiers in his army are "brave."

// A soldier is considered "brave" if their ID has exactly two factors (or Divisors) and is not a perfect square.

// Since King Luther is busy with his duties, he needs your help to count the number of "brave" soldiers in his army.

// Your task is to count how many soldiers have "brave" IDs according to the criteria.

import java.util.Scanner;

public class Day_1_nom_of_primes {

    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
    
        if (n <= 3) {
            return true;
        }

        for(int i = 2 ; i*i <= n ; i++){ 
            if(n % i == 0){
                return false ;
            }
        }
        return true ;
    }


    public static int countBraveSoldiers(int n) {
        int count = 0 ;
        for (int i = 1 ; i<=n ; i++ ){
            if(isPrime(i)){
                count++ ;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countBraveSoldiers(n);
        System.out.println(result);
        scanner.close();
    }
}