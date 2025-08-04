public class XN {
    
    public static int xn(int x , int n ){
        if(n==0){
            return 1 ;
        }
        int pxnm1 = xn(x , n-1);
        int pxn = x * pxnm1 ;
        return pxn ;
        
       
    }
    
    public static void main(String[] args) {
        
        int x = 3 ;
        int n = 4 ;
        System.out.println(xn(x , n ));
       
    }
}