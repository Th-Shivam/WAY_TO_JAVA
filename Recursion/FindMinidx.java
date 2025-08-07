class FindMinidx {
    public static int min_idx = 0 ;
    public static void Findmin(int[] arr , int n){
        if(n==0){
            if(arr[min_idx] > arr[n]){
            min_idx = n ; 
            }
            System.out.println("The minimum value's index is : " + min_idx) ;
            return ;
        }
        
        if(arr[min_idx] > arr[n]){
            min_idx = n ;
        }
        Findmin(arr , n-1);
    }
    
    public static void main(String[] args) {
        int arr[] = {7,10,25,75,105};
        
        int n = 4 ;
        Findmin(arr, n);
        
    }
}