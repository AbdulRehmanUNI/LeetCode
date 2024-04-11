class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
            if(nums[j]<=nums[j-1]) break;
            ans=Math.max(ans,j-i+1);
            }
        }
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]>=nums[j-1]) break;
                ans=Math.max(ans,j-i+1);
            }       
        }
        return ans;
        
    }
}