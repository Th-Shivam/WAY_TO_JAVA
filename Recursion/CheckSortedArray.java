class CheckSortedArray {
    public static boolean CheckSorted(int[] arr , int i , int n ){

        if(i == n-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }
        
        return CheckSorted(arr, i + 1, n);
    }
    
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
       int i = 0 ;
       int n = arr.length ;
  
        System.out.println(CheckSorted(arr , i , n ));
}

}