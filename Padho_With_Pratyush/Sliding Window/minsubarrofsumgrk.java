class Solution {
    public int minsubarrgrk(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int high = 0 ; 
        int sum = 0 ; 
        int low = 0 ;
        while(high<nums.length){
            sum += nums[high] ;
            while(sum>=target){
                
                min = Math.min(min,high-low+1);
                sum-= nums[low];
                low++;
                
            }
            high++;
            
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
