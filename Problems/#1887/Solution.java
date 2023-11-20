class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int ans=0;

        for(int i=nums.length-1; i>0; i--){
            if(nums[i] != nums[i-1]) ans+=nums.length-i;
        }
        return ans;
        
    }
}