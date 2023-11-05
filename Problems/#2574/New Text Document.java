class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[]=new int[nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i]=Math.abs(leftSum(nums,i)- rightSum(nums,i));
        }
        return ans;
    }
    public int leftSum(int[] nums, int i){
        if(i==0) return 0;
        if(i-1==0) return nums[0];
        int ans=0;
        for(int j=i-1; j>=0; j--) ans+=nums[j];
        return ans;
    }
    public int rightSum(int[] nums, int i){
        if(i==nums.length-1) return 0;
        if(i+1==nums.length-1) return nums[nums.length-1];
        int ans=0;
        for(int j=i+1; j<nums.length; j++) ans+=nums[j];
        return ans;
    }
}