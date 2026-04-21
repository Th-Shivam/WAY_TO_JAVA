import java.util.*;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the size of the array :");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("\nEnter the " + n + " elements for the array :\n");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nThe elements in the array are :\n");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nThe sorted array is :\n");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
