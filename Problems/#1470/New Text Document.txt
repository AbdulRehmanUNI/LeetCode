class Solution {
    public int[] shuffle(int[] nums, int n) {

        int ans[]=new int[2*n];

        for(int i=0; i<nums.length/2; i++){
                ans[i+i]=nums[i];
                ans[i+i+1]=nums[n++];
        }
        return ans;
    }
}