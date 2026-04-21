import java.util.* ;
class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    } 

    public static void main(String[] args) {
        SortedSquares ss = new SortedSquares();
        int[] nums = {-4,-1,0,3,10};
        int[] result = ss.sortedSquares(nums);
        System.out.println(Arrays.toString(result)); // Output: [0, 1, 9, 16, 100]
    }
}