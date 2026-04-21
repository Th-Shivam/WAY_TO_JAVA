public class ContainsDuplicate {

    boolean isDuplicate (int[] nums){
        boolean ans = false ;
        for(int i = 0 ; i<nums.length ; i++){
            for (int j = 0 ; j<nums.length ; j++){
                if(i != j && nums[i] == nums[j]){
                    return true ;
                }
            }
        }
        return ans ;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3} ;
        ContainsDuplicate obj = new ContainsDuplicate() ;
        System.out.println(obj.isDuplicate(nums));
    }
}
