import java.util.*;

public class MaDay_2_Mountain_Valley {
    public static int isMountainValleyPattern(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }

        // Check for equal adjacent elements (not allowed)
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return 0;
            }
        }

        // Case 1: Starts with an increasing pattern
        if (arr[0] < arr[1]) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (i % 2 == 0) { 
                    if (!(arr[i] < arr[i + 1])) return 0;
                } else {
                    if (!(arr[i] > arr[i + 1])) return 0;
                }
            }
            return 1;
        } 
        // Case 2: Starts with a decreasing pattern
        else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (i % 2 == 0) { 
                    if (!(arr[i] > arr[i + 1])) return 0;
                } else { 
                    if (!(arr[i] < arr[i + 1])) return 0;
                }
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(isMountainValleyPattern(arr));
    }
}
