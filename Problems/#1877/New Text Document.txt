class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0,j=nums.length-1;

        for(int i=0; i<nums.length/2; i++) 
            ans=Math.max(ans,nums[i]+nums[j--]);  

        return ans;
        
    }
}