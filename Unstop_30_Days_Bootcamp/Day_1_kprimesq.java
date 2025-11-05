// Problem Statement

// Given a number N. Your task is to create a program to calculate the N-th term of the Alice choice.

// Alice's sequence consists of the squares of prime numbers: 2^2, 3^2, 5^2, 7^2, 11^2,13^2,17^2,19^2, 23^2, 29^2,…………

import java.util.*;

class Day_1_kprimesq {

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

    static int kthprime(int n){
        int infinite = 9999999;
        int count = 0 ;
        int k_prime = 0 ;
        for(int i = 2 ; i<= infinite ; i++){
            if(count==n){
            return (int)Math.pow(k_prime , 2) ;
            
                 
            }
            if(isPrime(i)){
                k_prime = i ;
                count++ ;
            }
            
        }
        return (int)Math.pow(k_prime , 2) ;

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int k = sc.nextInt();
        System.out.println(kthprime(k) ) ;
        sc.close();
    }
}