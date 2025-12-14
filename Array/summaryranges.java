import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;

        int a = nums[0];
        int b = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1)
                b = nums[i];
            else{
                result.add(range(a,b));
                a = nums[i];
                b = nums[i];
            }
        }
        result.add(range(a,b));

        return result;
    }

    private String range(int a,int b){
        return (a == b) ? String.valueOf(a) : a + "->" + b;
    }
}