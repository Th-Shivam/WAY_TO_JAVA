package Recursion;
class SumtillN {
    
        public static void PrintSum(int i , int n , int sum){
            if(i>n){
                System.out.println(sum);
                return ;
            }
            
            sum += i ;
            PrintSum(i+1 , n , sum);
        }
        
        public static void main(String args[]){
            int n = 5 ;
            PrintSum(1 , n , 0);
        }
    
}