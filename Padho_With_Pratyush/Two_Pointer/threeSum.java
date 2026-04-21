public class threeSum {

    public static int[] sum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int toFind = target - arr[i];
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[j] + arr[k] == toFind) {
                    return new int[] { i, j, k };
                } else if (arr[j] + arr[k] > toFind) {
                    k--;
                } else {
                    j++;
                }
            }

        }
        return new int[] { -1, -1, -1 };
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 15;
        int res[] = sum(array, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
