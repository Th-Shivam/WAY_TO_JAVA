import java.util.Stack;

public class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> poss_j = new Stack<>();
        int k = Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]<k) return true;
            while(!poss_j.isEmpty()&& nums[i]>poss_j.peek()){
                k = poss_j.pop();
            }
            poss_j.push(nums[i]);
        }
        return false;
    }
}