class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans = 0;
        int max = nums[0], count = 0;
        for(int num : nums) max = Math.max(num, max);
        for(int l = 0, r = 0; r < nums.length; r++){
            if(nums[r] == max) count++;
            while(count >= k){
                ans+=nums.length-r;
                if (nums[l++] == max)
                count--; 
            }
        }
        return ans;
    }
}