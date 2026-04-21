import java.util.*;
public class Linear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        boolean found = false;


        System.out.println("Enter " + n + " elements:");

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == key){
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Element not found in the array.");
        }


        sc.close();
    }
}
