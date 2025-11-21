import java.util.* ;
public class RemoveDup {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5} ;
        List<Integer> unique = new ArrayList<>() ;
        int uniqueElem = 1 ;
        int p1 = 0 ;
        unique.add(arr[p1]) ;
        int p2 = 1 ;
        while(p2<arr.length){
            if(arr[p2-1] == arr[p2]){
                p2++ ;
            }else{
                arr[p1+1] = arr[p2] ;
                unique.add(arr[p2]) ;
                p2++ ;
                p1++ ;
                uniqueElem++ ;
            }
        }

        System.out.println("Number of unique elements: " + uniqueElem) ;
        System.out.println("Array with unique elements: " + unique) ;
    }
}
