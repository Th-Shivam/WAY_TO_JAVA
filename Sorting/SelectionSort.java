// Online Java Compiler
// Use this editor to write, compile and run your Java code online
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
        
        for(int i = 0 ; i<n-1 ; i++){
            for (int j=i ; j<n ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;                    
                }
            }
        }
        
        System.out.println("Sorted array :");
        
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}