class Sort01 {
    
    public static int c0 ;
     public static int c1 ;
    public static void Sortbin(int[] arr , int idx ){
        if(idx == arr.length-1){
            
            if(arr[idx] == 0){
            c0++ ;
            }else if (arr[idx] == 1){
            c1++ ;
        }
        
        int[] arrnew = new int[c1 + c0] ;
        for(int i = 0 ; i<c0 ; i++){
            arrnew[i] = 0 ;
        }
        for(int i = 0 ; i<c1 ; i++){
            arrnew[i] = 1 ;
        }
        
        for(int i = 0 ; i<c1+c0 ; i++){
            System.out.print(arrnew[i]);
        }
        
        return ;
        
        
        }
        
        if(arr[idx] == 0){
            c0++ ;
            Sortbin(arr , idx+1) ;
        }else if (arr[idx] == 1){
            c1++ ;
            Sortbin(arr , idx+1) ;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0} ;
        Sortbin(arr , 0) ;
    }
}