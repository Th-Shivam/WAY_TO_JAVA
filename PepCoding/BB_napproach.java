// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.* ;
class BB_napproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n :") ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = i+1 ;
        }
        
         System.out.println("Elem of the array :") ;
        for(int i = 0 ; i<arr.length ; i++ ){
            System.out.println(arr[i]) ;
        }
        
        // List<Integer> output = new List<> ;
        
        int output[] = new int[n] ;
        for(int i = 0 ; i<output.length ; i++){
            for(int j = 1 ; j<=n ; j++ ){
                if(arr[i] % j == 0){
                    if(output[i] == 0){
                        output[i] = 1 ;
                    }else{
                        output[i] = 0 ;
                    }
                }
            }
        }

        for(int i = 0 ; i<output.length ; i++ ){
            System.out.print(output[i] + " ") ;
        }
        sc.close() ;
    }
}