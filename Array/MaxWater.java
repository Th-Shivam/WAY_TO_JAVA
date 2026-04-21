import java.util.* ;
public class MaxWater {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;

        int max = 0 ;
        int first = 0;
        int n = 8;
        int[] arr = new int[n]; 

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt() ;
        } 

        for(int i = 1 ; i<arr.length ; i++){
            if(arr[first] > arr[i]){
                max += arr[first] - arr[i] ;
            }else{
                first = i ;
            }
        }

        System.out.println("The max water capacity is : " + max) ;

        sc.close() ;
    }
}
