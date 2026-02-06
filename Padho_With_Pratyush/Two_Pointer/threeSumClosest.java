import java.util.Arrays;

public class threeSumClosest {

    public static int sum(int[] arr, int target) {
        if (arr.length < 3) {
            return 0;
        }

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    return sum;
                }

                else if (Math.abs(target - sum) < minDiff) {
                    minDiff = Math.abs(target - sum);
                    result = sum;
                }
                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 13;
        System.out.println(sum(arr, target));
    }
}
