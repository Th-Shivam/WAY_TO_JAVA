import java.util.Arrays;
class Arrayproductexceptself {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int zeroindex=-1;
        boolean zerofound=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&(!zerofound)){
                zerofound=!zerofound;
                zeroindex=i;
                continue;
            }
            mul*=nums[i];
        }
        if(zerofound){
            Arrays.fill(nums,0);
            nums[zeroindex]=mul;
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=mul/nums[i];
        }
        return nums;
    }
}