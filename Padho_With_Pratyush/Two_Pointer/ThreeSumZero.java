import java.util.Arrays;

public class ThreeSumZero {

    public static int[] sum(int[] arr) {

        Arrays.sort(arr); 

        for (int i = 0; i < arr.length - 2; i++) {

            int target = -arr[i];
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int s = arr[j] + arr[k];

                if (s == target) {
                    return new int[]{arr[i], arr[j], arr[k]};
                }
                else if (s < target) {
                    j++;   // sum chhota → left badhao
                }
                else {
                    k--;   // sum bada → right ghatao
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -2, -4};
        int[] result = sum(arr);

        if (result.length == 0) {
            System.out.println("No triplet found");
        } else {
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
}
