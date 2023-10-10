class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int []ans=new int[nums.length];
        int x=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0) {
                ans[x]=nums[i];
                x++;
            }
        }
        for(int i=0; i< nums.length; i++){
            if(nums[i]%2!=0){
                ans[x]=nums[i];
                x++;
            }
        }
        return ans;
    }
}