import java.util.*;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnetr the number of rows :");
        int rows = sc.nextInt();
        System.out.println("\nEnetr the number of columns :");
        int cols = sc.nextInt();

        // declaring a 2D array

        int[][] arr = new int[rows][cols];

        //getting elements from the user 

        System.out.println("\nEnter " + (rows * cols) + " elements:\n");

        for(int i = 0 ; i<rows ; i++){
            for (int j = 0 ; j<cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Displaying the 2D array

        System.out.println("\nThe 2D array is:\n");

        for(int i = 0 ; i<rows ; i++){
            for (int j = 0 ; j<cols ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



        sc.close();
    }
}
