import java.util.* ;
class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int arr[] = new int[n] ;
        System.out.println("Enter the " + n + " elements of the array :");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0 ; i<arr.length-1 ; i++){
            int min_idx = i ;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[min_idx] > arr[j] ){
                    min_idx = j ;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp ;
        }
        
        System.out.println("Sorted array :");
        
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}