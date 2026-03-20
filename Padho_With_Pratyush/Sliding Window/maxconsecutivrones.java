class Solution {

    public int longestOnes(int[] nums, int k) {
        int contiguous1s = 0;
        int maxContiguous1s = 0;
        int[] flipedIndexes = new int[k];
        int fi = 0;

        // handle edgecase when k = 0;
        if(k == 0){
            for(int j = 0; j<nums.length; j++){
                if(nums[j] == 1) contiguous1s++;
                else{
                    if(contiguous1s > maxContiguous1s) maxContiguous1s = contiguous1s;
                    contiguous1s = 0;
                }
            }
            if(contiguous1s > maxContiguous1s) maxContiguous1s = contiguous1s;
            return maxContiguous1s;
        }

        for( int i=0; i < k; i++){
            flipedIndexes[i] = -1;
        }
        int start = 0;
        for(int i=0; i<nums.length; i++){
            // using the sliding window array to track the indexes flipped
            if(nums[i]==0){
                
                start = flipedIndexes[fi % k] + 1;
                flipedIndexes[fi % k] = i;
                fi++;
            }
            contiguous1s = i - start + 1;
            if(contiguous1s > maxContiguous1s) maxContiguous1s = contiguous1s;
        }
        return maxContiguous1s;
    }
}