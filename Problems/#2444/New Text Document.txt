
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int l=-1, prevMinIndex=-1, prevMaxIndex=-1;
        long ans=0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]<minK || nums[r]>maxK) l=r;
            if(nums[r]==minK) prevMinIndex=r;
            if(nums[r]==maxK) prevMaxIndex=r;
            ans+=Math.max(0, Math.min(prevMinIndex,prevMaxIndex)-l);
        }
        return ans;

        
    }
}