public class mergeSorted{

    public static int[] merge(int[] arr1 , int[] arr2){
        int i = 0 ;
        int j = 0 ;
        int counter = 0 ;
        int res[] = new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[counter] = arr1[i];
                i++;
                counter++ ;
            }else{
                res[counter] = arr2[j];
                j++;
                counter++ ;
            }
        }
        while(i<arr1.length){
            res[counter] = arr1[i] ;
            counter++ ; 
            i++ ;
        }
        while(j<arr2.length){
            res[counter] = arr2[j] ;
            counter++;
            j++;
        }
        return res;
    }
    public static void main(String[] args){
        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,6,8,10};
        int res[] = merge(arr1,arr2);
        for(int i = 0 ; i<res.length ; i++){
            System.out.print(res[i]+" ");
        }
    }
}