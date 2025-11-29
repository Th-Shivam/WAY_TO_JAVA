public class MajorityElement {
    public static int majority(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Step 1: find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: optional verify candidate (if array guaranteed majority nahi deta ho)
        int freq = 0;
        for (int num : nums) {
            if (num == candidate) freq++;
        }

        return (freq > nums.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majority(arr));
    }
}
