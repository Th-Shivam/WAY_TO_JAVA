import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Day_3_array1 {
    public static int findLargestNumber(List<Integer> arr) {
        Collections.sort(arr);

        int min1 = arr.get(0);
        int min2 = arr.get(1);

        String largestNumberStr = String.valueOf(min2) + String.valueOf(min1);
        
        return Integer.parseInt(largestNumberStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        
        scanner.close();
        
        if (n >= 2) {
            int result = findLargestNumber(arr);
            System.out.println(result);
        } else {
            System.out.println("Input array must contain at least two elements.");
        }
    }
}