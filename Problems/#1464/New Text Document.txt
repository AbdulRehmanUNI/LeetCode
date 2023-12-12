class Solution {
    public int maxProduct(int[] nums) {
        // int ans=0;

        // for(int i=0; i<nums.length; i++)
        //     for(int j=i+1; j<nums.length; j++) ans=Math.max(ans, (nums[i]-1)*(nums[j]-1));

        // return ans;
        Arrays.sort(nums);
        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    }
}