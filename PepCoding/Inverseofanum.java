package PepCoding;

class Inverseofanum {
    public static void main(String[] args) {
        int n = 21453 ;
        int pos = 1 ;
        int inverse = 0 ;
        while(n != 0 ){
            int od = n % 10 ;
            int id = pos ;
            int ip = od ;
            
            
            n /= 10 ;
            inverse = inverse + id * (int)Math.pow(10 , ip - 1 ) ;
            pos++ ;
        }
        
        System.out.println(inverse) ;
    }
}