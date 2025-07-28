import java.util.*;
public class Searchin2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnetr the number of rows :");
        int rows = sc.nextInt();
        System.out.println("\nEnetr the number of columns :");
        int cols = sc.nextInt();

        // declaring a 2D array

        int[][] arr = new int[rows][cols];

        // getting elements from the user 

        System.out.println("\nEnter " + (rows * cols) + " elements:\n");

        for(int i = 0 ; i<rows ; i++){
            for (int j = 0 ; j<cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter the element to be searched:\n");

        int key = sc.nextInt() ;

        boolean found = false;

        // Searching for the element in the 2D array

        for(int i = 0 ; i<rows ; i++){
            for (int j = 0 ; j<cols ; j++){
                if((arr[i][j] == key)){
                    System.out.println("\nElement found at index [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            System.out.println();
        }

        if(!found) {
            System.out.println("Element not found in the array.");
        }



        sc.close();
    }
}
